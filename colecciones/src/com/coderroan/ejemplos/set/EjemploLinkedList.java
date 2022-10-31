package com.coderroan.ejemplos.set;

import com.coderroan.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size: " + enlazada.size() );
        System.out.println("La lista esta vacia: " + enlazada.isEmpty());
        enlazada.add(new Alumno("Eliceo", 9));
        enlazada.add(new Alumno("Raul", 7));
        enlazada.add(new Alumno("Sandra", 4));
        enlazada.add(new Alumno("Agel", 5));
        enlazada.add(new Alumno("Brandon", 5));
        enlazada.add(new Alumno("Manuel", 6));
        enlazada.add(new Alumno("Luis", 5));
        System.out.println(enlazada + ", size lista: " + enlazada.size());
        enlazada.addFirst(new Alumno("Marco", 7));
        enlazada.addLast(new Alumno("Aurelio", 10));
        System.out.println(enlazada + ", size lista: " + enlazada.size());
        System.out.println("Primer elemento: " + enlazada.getFirst());
        System.out.println("Ultimo elemento: " + enlazada.getLast());
        System.out.println("Indice 1: " + enlazada.get(1));

        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size lista: " + enlazada.size());

        enlazada.remove(new Alumno("Luis", 5));
        System.out.println(enlazada + ", size lista: " + enlazada.size());

        Alumno a = new Alumno("Lucas", 10);
        enlazada.addLast(a);
        System.out.println(enlazada + ", size lista: " + enlazada.size());
        System.out.println(Color.BLUE + "Index de Lucas: " + enlazada.indexOf(a) + Color.RESET);

        enlazada.remove(0);
        System.out.println(enlazada + ", size lista: " + enlazada.size());
        System.out.println(Color.BLUE + "Index de Lucas: " + enlazada.indexOf(a) + Color.RESET);

        enlazada.set(3, new Alumno("Martin", 5));
        System.out.println(enlazada + ", size lista: " + enlazada.size());

        System.out.println(Color.CYAN_BACKGROUND + "ListIterator" + Color.RESET );
        ListIterator<Alumno> li = enlazada.listIterator();
        System.out.println(Color.GREEN + ":: hasNext ::" + Color.RESET );
        while (li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }

        System.out.println(Color.GREEN + ":: hasPrevious ::" + Color.RESET );
        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
