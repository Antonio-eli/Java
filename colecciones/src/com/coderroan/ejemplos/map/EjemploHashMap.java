package com.coderroan.ejemplos.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put("Nombre", "Eliceo");
        persona.put("Apellido", "Romero");
        persona.put("Email", "eliceoroan@gmail.com");
        persona.put("Edad", "25");
        System.out.println("Persona: " +  persona);
        String nombre = persona.get("Nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("Apellido");
        System.out.println("apellido = " + apellido);



    }
}
