package com.mx.roancoder.api.stream.ejemplos;

import com.mx.roancoder.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamSingle2 {
    public static void main(String[] args) {
        Usuario usuario = Stream
                .of("Pato Guzman", "Pepe Gonzalez","Luis Villa","Angel Salsa", "Pepe Hernadez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(1))
                .findFirst().get();

        System.out.println(usuario);
    }
}
