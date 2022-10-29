package com.coderroan.ejemplos.set;

import com.coderroan.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Eliceo", 9));
        sa.add(new Alumno("Eliceo2", 9));
        sa.add(new Alumno("Raul", 7));
        sa.add(new Alumno("Manuel", 6));
        sa.add(new Alumno("Sandra", 4));
        sa.add(new Alumno("Agel", 5));
        sa.add(new Alumno("Brandon", 5));
        sa.add(new Alumno("Luis", 5));
        sa.add(new Alumno("Luis", 6));
        System.out.println("Alumnos = " + sa);
    }
}
