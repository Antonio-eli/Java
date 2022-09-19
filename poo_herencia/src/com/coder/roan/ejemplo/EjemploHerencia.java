package com.coder.roan.ejemplo;

import com.coder.roan.pooherencia.Alumno;
import com.coder.roan.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Eliceo");
        alumno.setApellido("Romero");
        alumno.setInstitucion("UNAM");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " estudia en: " + alumno.getInstitucion());

        Profesor profesor = new Profesor();
        profesor.setNombre("Raul");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Matematicas");
        System.out.println("Profesor de " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());
    }
}
