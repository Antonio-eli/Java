package com.mx.roancoder.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pato ", "Pepe","Luis","Angel")
                .peek(System.out::println)
                .map(nombre -> {
                    return nombre.toUpperCase();
                })
                .map(e -> e.toLowerCase());
        nombres.forEach(System.out::println);
    }
}
