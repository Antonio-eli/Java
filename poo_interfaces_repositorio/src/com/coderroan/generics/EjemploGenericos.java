package com.coderroan.generics;

import com.coderroan.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Eliceo", "Romero"));
        Cliente eliceo = clientes.iterator().next();
        Cliente[] clientesArreglo = {
                new Cliente("Raul", "Perez"),
                new Cliente("Santiago", "Gonzalez")
        };
        Integer[] enterosArreglo = {1,2,3,4};
        System.out.println(ANSI_BLUE + "[ Conversión de arreglo a una lista ]" + ANSI_RESET);
        List<Cliente> clienteLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);
        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Cristiano", "Leo", "Ana", "Iván"}, enterosArreglo);

        clienteLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);
        nombres.forEach(System.out::println);

    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    public static <T, G> List<T> fromArrayToList(T[] c, G[] x){
        for (G elemento: x){
            System.out.println(elemento);
        }

        return Arrays.asList(c);
    }
}
