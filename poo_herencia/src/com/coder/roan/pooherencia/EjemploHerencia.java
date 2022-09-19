package com.coder.roan.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Eliceo");
        alumno.setApellido("Romero");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido());

        Profesor profesor = new Profesor();
        profesor.setNombre("Raul");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Matematicas");
        System.out.println("Profesor de " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());
    }
}
