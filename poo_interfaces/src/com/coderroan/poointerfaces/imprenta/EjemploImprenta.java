package com.coderroan.poointerfaces.imprenta;

import com.coderroan.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Eliceo", "Ing. Sistemas", "Resumen laboral");
        cv.addExperiencia("java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador fullstack");
        cv.addExperiencia("Angular");

        Libro libro = new Libro("Erick Gama", "Patrones de diseño: Elementos reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Capítulo Patron Singlenton"))
                .addPagina(new Pagina("Capítulo Patron observador"))
                .addPagina(new Pagina("Capítulo Patron Factory"))
                .addPagina(new Pagina("Capítulo Patron Composite"))
                .addPagina(new Pagina("Capítulo Patron Facade"));

        Informe informe = new Informe("Martin Fowler", "James", "Estudio de microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
