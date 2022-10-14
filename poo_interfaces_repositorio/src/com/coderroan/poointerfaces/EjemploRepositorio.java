package com.coderroan.poointerfaces;

import com.coderroan.poointerfaces.modelo.Cliente;
import com.coderroan.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Eliceo", "Romero"));
        repo.crear(new Cliente("Maria", "Gonzalez"));
        repo.crear(new Cliente("Renata", "Lopez"));
        repo.crear(new Cliente("Lonardo", "Vargas"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println(ANSI_BLUE + "==== paginable ====" + ANSI_RESET);
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1,3);
        paginable.forEach(System.out::println);
        System.out.println(ANSI_BLUE + "==== Ordenar ====" + ANSI_RESET);
        List<Cliente> clientesOderAsc = ((OrdenableRepositorio)repo).listar("apellido", Direccion.DESC);
        for (Cliente c: clientesOderAsc) {
            System.out.println("Cliente: " + c);
        }
        System.out.println(ANSI_BLUE + "==== Editar  ====" + ANSI_RESET);
        Cliente mariaActualizar = new Cliente("Eva", "Antonio");
        mariaActualizar.setId(2);
        repo.editar(mariaActualizar);
        Cliente maria = repo.porId(2);
        System.out.println("Maria: " + maria);
        System.out.println(ANSI_BLUE + "==== Datos Actualizados ====" + ANSI_RESET);
        ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println(ANSI_BLUE + "==== Eliminar Datos ====" + ANSI_RESET);
        repo.eliminar(4);
        repo.listar().forEach(System.out::println);
    }
}
