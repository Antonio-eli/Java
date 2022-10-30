package com.coderroan.ejemplos.set;

import com.coderroan.ejemplos.modelo.Alumno;

import java.util.*;
import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Eliceo", 9));
        sa.add(new Alumno("Eliceo2", 9));
        sa.add(new Alumno("Raul", 7));
        sa.add(new Alumno("Manuel", 6));
        sa.add(new Alumno("Sandra", 4));
        sa.add(new Alumno("Agel", 5));
        sa.add(new Alumno("Brandon", 5));
        sa.add(new Alumno("Luis", 5));
        sa.add(new Alumno("Luis", 6));
        //Collections.sort(sa, (a, b) -> a.getNombre().compareTo(b.getNombre()));
        //sa.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));
        sa.sort(comparing( Alumno::getNombre ).reversed());
        System.out.println("Alumnos = " + sa);

        System.out.println(Color.BLACK_BACKGROUND_BRIGHT + "Utilizando expresion lambda Stream forEach" + Color.RESET);
        sa.forEach(System.out::println);

    }
}
