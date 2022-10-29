package com.coderroan.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        String[] peces = {"Ángel", "cebra", "tetra","Ángel",  "platy", "molly negro", "cebra", "ángel"};
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces) {
            if (!unicos.add(pez)) {
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Unicos: " + ANSI_YELLOW   + unicos + ANSI_RESET);
        System.out.println("Duplicados: " + duplicados);
    }
}
