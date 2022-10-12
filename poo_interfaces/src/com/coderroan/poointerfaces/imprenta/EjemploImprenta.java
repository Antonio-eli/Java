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

        Libro libro = new Libro("Erick Gama", "Patrones de dise�o: Elementos reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Cap�tulo Patron Singlenton"))
                .addPagina(new Pagina("Cap�tulo Patron observador"))
                .addPagina(new Pagina("Cap�tulo Patron Factory"))
                .addPagina(new Pagina("Cap�tulo Patron Composite"))
                .addPagina(new Pagina("Cap�tulo Patron Facade"));

        Informe informe = new Informe("Martin Fowler", "James", "Estudio de microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
