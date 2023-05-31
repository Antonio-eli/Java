package com.coderroan.poointerfaces;

import com.coderroan.poointerfaces.modelo.Cliente;
import com.coderroan.poointerfaces.repositorio.*;
import com.coderroan.poointerfaces.repositorio.excepciones.*;
import com.coderroan.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Eliceo", "Romero"));
            repo.crear(new Cliente("Maria", "Gonzalez"));
            repo.crear(new Cliente("Renata", "Lopez"));
            repo.crear(new Cliente("Lonardo", "Vargas"));
            Cliente martin =  new Cliente("Martin", "Carbajal");
            repo.crear(martin);
            repo.crear(martin);

            System.out.println(ANSI_BLUE + "[ Lista clientes ]" + ANSI_RESET);
            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);

            System.out.println(ANSI_BLUE + "[ Paginable ]" + ANSI_RESET);
            List<Cliente> paginable = repo.listar(1, 3);
            paginable.forEach(System.out::println);

            System.out.println(ANSI_BLUE + "[ Ordenar ]" + ANSI_RESET);
            List<Cliente> clientesOderAsc = repo.listar("id", Direccion.ASC);
            for (Cliente c : clientesOderAsc) {
                System.out.println("Cliente: " + c);
            }

            System.out.println(ANSI_BLUE + "[ Editar ]" + ANSI_RESET);
            Cliente mariaActualizar = new Cliente("Maria", "Hernández");
            mariaActualizar.setId(2);
            repo.editar(mariaActualizar);
            Cliente maria = repo.porId(2);
            System.out.println("Actualizando Apellido: " + maria);

            System.out.println(ANSI_BLUE + "[ Datos Editados ]" + ANSI_RESET);
            repo.listar("nombre", Direccion.DESC).forEach(System.out::println);

            System.out.println(ANSI_BLUE + "[ Eliminar Datos ]" + ANSI_RESET);
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);

            System.out.println(ANSI_BLUE + "[ Datos Total ]" + ANSI_RESET);
            System.out.println("Total de registro: " + repo.total());
        } catch (RegistroDuplicadoDatoException e){
            System.out.println("Excepción de Registro duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Excepción de Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e){
            System.out.println("Excepción de Escritura: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Excepción generica: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
