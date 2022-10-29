package com.coderroan.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
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
        System.out.println("Unicos: " + Color.YELLOW   + unicos + Color.RESET);
        System.out.println("Duplicados: " + duplicados);
    }
}
