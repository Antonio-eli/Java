package com.mx.roancoder.java8_lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        Function<String, String> function = param -> "Hola que tal " + param;
        String resultado = function.apply("Eliceo");
        System.out.println(resultado);

        Function<String, String> function2 = String::toUpperCase;
        System.out.println(function2.apply("eliceo"));

        BiFunction<String, String, String> function3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String resultado2 = function3.apply("romero","antonio");
        System.out.println(resultado2);

        BiFunction<String, String, Integer> function4 = String::compareTo;
        System.out.println(function4.apply("eliceo", "eliceo"));

        BiFunction<String, String, String> function5 = String::concat;
        System.out.println(function5.apply("eliceo", "romero"));

    }
}
