package com.coderroan.ejemplos.list;

import com.coderroan.ejemplos.modelo.Alumno;
import com.coderroan.ejemplos.set.Color;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size: " + al.size() );
        System.out.println("La lista esta vacia: " + al.isEmpty());
        al.add(new Alumno("Eliceo", 9));
        al.add(new Alumno("Raul", 7));
        al.add(new Alumno("Sandra", 4));
        al.add(new Alumno("Agel", 5));
        al.add(new Alumno("Brandon", 5));
        al.add(0, new Alumno("Manuel", 6));
        al.set(3, new Alumno("Luis", 5));
        System.out.println(al + ", size lista: " + al.size() );

        al.remove(new Alumno("Eliceo", 9));
        //al.remove(0);
        System.out.println(al + ", size: " + al.size() );

        boolean b = al.contains(new Alumno("Manuel", 6));
        System.out.println(Color.WHITE_UNDERLINED + "La lista contiene a Manuel: " + Color.RESET + Color.GREEN +  b + Color.RESET);

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(Color.YELLOW + "Desde el arreglo: " + Color.RESET + a[i]);
        }




    }
}
