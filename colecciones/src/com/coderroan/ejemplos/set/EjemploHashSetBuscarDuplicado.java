package com.coderroan.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        String[] peces = {"Ángel", "cebra", "tetra", "platy", "molly negro", "cebra", "ángel"};
        Set<String> unicos = new HashSet<>();
        for (String pez: peces) {
            if (!unicos.add(pez)) {
                System.out.println(ANSI_RED + "Elemento duplicado: " + pez + ANSI_RESET);
            }
        }
        System.out.println(ANSI_BLUE + "[" + unicos.size() + "]" + ANSI_RESET + " elementos no duplicados: " + unicos);
    }
}
