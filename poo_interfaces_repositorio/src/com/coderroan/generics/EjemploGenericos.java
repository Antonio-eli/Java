package com.coderroan.generics;

import com.coderroan.poointerfaces.modelo.Cliente;
import com.coderroan.poointerfaces.modelo.ClientePremium;

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

        List<ClientePremium> clientePremiumList = fromArrayToList(new ClientePremium[]{
                new ClientePremium("Nora", "Sanchez")
        });
        System.out.println(ANSI_BLUE + "[ Métodos genéricos con tipo List y comodines - Wildcards Generics ]" + ANSI_RESET);
        imprimirClientes(clientes);
        imprimirClientes(clienteLista);
        imprimirClientes(clientePremiumList);
        System.out.println(ANSI_BLUE + "[ Métodos genéricos máximo ]" + ANSI_RESET);
        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1,3,9));
        System.out.println("Máximo de 3.9, 11.6 y 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Máximo de Zanahoria, Naranja y Manzana es: " + maximo("Zanahoria", "Naranja", "Manzana"));


    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    public static <T, G> List<T> fromArrayToList(T[] c, G[] x){
        for (G elemento: x){
            System.out.println(elemento);
        }

        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0){ max = b; }
        if (c.compareTo(max) > 0){ max = c; }

        return max;
    }
}


