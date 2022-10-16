package com.coderroan.poointerfaces;

import com.coderroan.poointerfaces.modelo.Cliente;
import com.coderroan.poointerfaces.modelo.Producto;
import com.coderroan.poointerfaces.repositorio.Direccion;
import com.coderroan.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import com.coderroan.poointerfaces.repositorio.lista.ClienteListRepositorio;
import com.coderroan.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Silla", 350.55));
        repo.crear(new Producto("Cuaderno", 15.5));
        repo.crear(new Producto("Lamapara", 150));
        repo.crear(new Producto("Plumas", 50.99));


        System.out.println(ANSI_BLUE + "[ Lista Producto ]" + ANSI_RESET);
        List<Producto> producto = repo.listar();
        producto.forEach(System.out::println);

        System.out.println(ANSI_BLUE + "[ Paginable ]" + ANSI_RESET);
        List<Producto> paginable = repo.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println(ANSI_BLUE + "[ Ordenar ]" + ANSI_RESET);
        List<Producto> productosOderAsc = repo.listar("id", Direccion.DESC);
        for (Producto p: productosOderAsc) {
            System.out.println("Producto: " + p);
        }

        System.out.println(ANSI_BLUE + "[ Editar ]" + ANSI_RESET);
        Producto cuadernoActualizar = new Producto("Cuaderno cuadro chico", 25.50);
        cuadernoActualizar.setId(2);
        repo.editar(cuadernoActualizar);
        Producto cuaderno = repo.porId(2);
        System.out.println("Actualizando Cuaderno: " + cuaderno);

        System.out.println(ANSI_BLUE + "[ Datos Editados ]" + ANSI_RESET);
        repo.listar("Descripcion", Direccion.DESC).forEach(System.out::println);

        System.out.println(ANSI_BLUE + "[ Eliminar Datos ]" + ANSI_RESET);
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println(ANSI_BLUE + "[ Datos Total ]" + ANSI_RESET);
        System.out.println("Total de registro: " + repo.total());
    }
}
