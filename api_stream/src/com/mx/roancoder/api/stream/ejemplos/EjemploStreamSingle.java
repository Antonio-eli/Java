package com.mx.roancoder.api.stream.ejemplos;

import com.mx.roancoder.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamSingle {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Pepe Gonzalez","Luis Villa","Angel Salsa", "Pepe Hernadez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.get());
    }
}
