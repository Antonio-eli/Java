package com.mx.roancoder.java8_lambda;

import com.mx.roancoder.java8_lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        Consumer<Date> consumer = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumer.accept(new Date());
        BiConsumer<String, Integer> consumerBi = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " anos!");
        consumerBi.accept("Eliceo", 25);

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("Eliceo", "Elias", "Raul");
        nombres.forEach(consumer2);

        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Luis");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda Supplier";
        System.out.println(proveedor.get());
    }
}
