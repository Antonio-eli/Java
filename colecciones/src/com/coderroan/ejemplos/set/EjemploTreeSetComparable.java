package com.coderroan.ejemplos.set;

import com.coderroan.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre()));
        sa.add(new Alumno("Eliceo", 9));
        sa.add(new Alumno("Raul", 7));
        sa.add(new Alumno("Manuel", 6));
        sa.add(new Alumno("Sandra", 4));
        sa.add(new Alumno("Agel", 5));
        System.out.println("Alumnos = " + sa);
    }
}
