package com.mx.roancoder.java8_lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
        Consumer<Date> consumer = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumer.accept(new Date());
        BiConsumer<String, Integer> consumerBi = (nombre, edad) -> {
            System.out.println(nombre + ", tiene " + edad + " anos!");
        };
        consumerBi.accept("Eliceo", 25);
    }
}
