package com.coderroan.ejemplos.set;
import java.util.HashSet;
import java.util.Set;



public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Ángel", "cebra", "tetra", "platy", "molly negro", "cebra", "ángel"};
        Set<String> unicos = new HashSet<>();
        for (String pez: peces) {
            if (!unicos.add(pez)) {
                System.out.println(Color.RED + "Elemento duplicado: " + pez + Color.RESET);
            }
        }
        System.out.println(Color.BLUE + "[" + unicos.size() + "]" + Color.RESET + " elementos no duplicados: " + unicos);
    }
}
