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

        Informe informe = new Informe("Martin Fowler", "James", "Estudio de microservicios");
        imprimir(cv);
        imprimir(informe);

    }
    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
