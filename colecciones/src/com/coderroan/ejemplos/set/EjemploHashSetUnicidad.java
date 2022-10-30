package com.coderroan.ejemplos.set;

import com.coderroan.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>();
        //List<Alumno> sa = new LinkedList<>();
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
        /*System.out.println(Color.GREEN + "Iterando usando un for clasico" + Color.RESET);
        for (int i = 0; i<sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }*/
        System.out.println(Color.CYAN + "Iterando usando un foreach" + Color.RESET);
        for (Alumno a : sa ) {
            System.out.println(a.getNombre());
        }
        System.out.println(Color.BLUE + "Iterando usando un while e Iterator" + Color.RESET);
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        System.out.println(Color.BLACK_BACKGROUND_BRIGHT + "Utilizando expresion lambda Stream forEach" + Color.RESET);
        sa.forEach(System.out::println);

    }
}
