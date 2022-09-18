package com.coder.roan.app;
import com.coder.roan.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro();
        persona.nombre = "Eliceo";
        System.out.println("persona.nombre = " + persona.nombre);
        perro.nombre = "Burca";
        System.out.println("perro.nombre = " + perro.nombre);
        perro.raza = "Pitbull";
        System.out.println("perro.raza = " + perro.raza);
    }
}
