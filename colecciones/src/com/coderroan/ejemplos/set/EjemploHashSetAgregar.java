package com.coderroan.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);
        boolean b = hs.add("cinco");
        System.out.println("\nPermite objetos duplicados? " + b);
        System.out.println(hs);
    }
}
