package com.coderroan.poointerfaces.imprenta;

import com.coderroan.poointerfaces.imprenta.modelo.*;
import static com.coderroan.poointerfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum( new Persona("Eliceo", "Romero"), "Ing. Sistemas", "Resumen laboral");
        cv.addExperiencia("java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro( new Persona("Erick", "Gama"), "Patrones de dise�o: Elementos reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Cap�tulo Patron Singlenton"))
                .addPagina(new Pagina("Cap�tulo Patron observador"))
                .addPagina(new Pagina("Cap�tulo Patron Factory"))
                .addPagina(new Pagina("Cap�tulo Patron Composite"))
                .addPagina(new Pagina("Cap�tulo Patron Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"), new Persona("James", "Joe"), "Estudio de microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto generico de una clase anonima";
            }
        });

    }
}
