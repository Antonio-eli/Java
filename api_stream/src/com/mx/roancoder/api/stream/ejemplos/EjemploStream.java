package com.mx.roancoder.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        /*Stream<String> nombres = Stream.of("Pato ", "Pepe","Luis","Angel");
          nombres.forEach(System.out::println);
         */

        /*String[] arr = {"Pato ", "Pepe","Luis","Angel"};
          Stream<String> nombres = Arrays.stream(arr);
          nombres.forEach(System.out::println);
         */

        /*Stream<String> nombres = Stream.<String>builder().add("Pato")
                .add("Pepe")
                .add("Luis")
                .add("Angel")
                .build();
          nombres.forEach(System.out::println);
         */
        List<String> lista = new ArrayList<>();
        lista.add("Pepe");
        lista.add("Luis");
        lista.add("Pepe");
        lista.add("Pato");
        /*
        Stream<String> nombres = lista.stream();
        nombres.forEach(System.out::println);
         */
        lista.forEach(System.out::println);




    }
}
