package com.coderroan.ejemplos.map;

import com.coderroan.ejemplos.set.Color;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        persona.put("Nombre", "Eliceo");
        persona.put("Apellido", "Romero");
        persona.put("ApellidoPaterno", "Romero");
        persona.put("Email", "eliceoroan@gmail.com");
        persona.put("Edad", "25");

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais","Mexico");
        direccion.put("estado","CDMx");
        direccion.put("ciudad","Alvaro Obregon");
        direccion.put("calle","1CDA San Diego");
        direccion.put("numero","12");

        persona.put("direccion", direccion);
        System.out.println("Persona: " +  persona);



    }
}
