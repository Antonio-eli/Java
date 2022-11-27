package com.coderroan.ejemplos.map;

import com.coderroan.ejemplos.set.Color;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        System.out.println(Color.WHITE_UNDERLINED + "Contiene elementos = " + !persona.isEmpty() + Color.RESET);
        persona.put(null, "1234");
        persona.put("Nombre", "Eliceo");
        persona.put("Apellido", "Romero");
        persona.put("ApellidoPaterno", "Romero");
        persona.put("Email", "eliceoroan@gmail.com");
        persona.put("Edad", "25");
        System.out.println("Persona: " +  persona);

        /*Obtener valores espefificos del HashMap*/
        String nombre = persona.get("Nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("Apellido");
        System.out.println("apellido = " + apellido);

        /*HashMap métodos más importates*/

        System.out.println(Color.BLUE_BOLD + ":: Metodo remove ::" + Color.RESET);
        String email = persona.remove("Email");
        //boolean email = persona.remove("Email","eliceoroan@gmail.com");
        System.out.println("Eliminado: " +  email);
        System.out.println("Persona: " +  persona);

        System.out.println(Color.BLUE_BOLD + ":: Metodo containsKey ::" + Color.RESET);
        boolean b = persona.containsKey("Email");
        System.out.println(Color.RED + "Tiene Email = " + b + Color.RESET);

        System.out.println(Color.BLUE_BOLD + ":: Metodo containsValue ::" + Color.RESET);
        b = persona.containsValue("Romero");
        System.out.println(Color.RED + "Existe el valor de Romero en el HashMap= " + b + Color.RESET);

        System.out.println(Color.BLUE_BOLD + ":: Metodo values ::" + Color.RESET);
        Collection<String> valores = persona.values();
        for (String v : valores ) {
            System.out.println("v = " + v);
        }

        System.out.println(Color.BLUE_BOLD + ":: Metodo keySet ::" + Color.RESET);
        Set<String> llaves = persona.keySet();
        for (String k : llaves) {
            System.out.println(Color.YELLOW + "k = " + k + Color.RESET);
        }

        System.out.println(Color.BLUE_BOLD + ":: Metodo entrySet ::" + Color.RESET);
        for (Map.Entry<String, String> par : persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println(Color.BLUE_BOLD + ":: Alternativa simple ::" + Color.RESET);

        for (String llave : persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(Color.YELLOW + llave + " -> " + valor + Color.RESET);
        }

        System.out.println(Color.BLUE_BOLD + ":: Expresion lamda con Java 8::" + Color.RESET);
        persona.forEach((llave, valor) ->{
            System.out.println(Color.MAGENTA + llave + " -> " + valor + Color.RESET);
        });
        System.out.println(Color.BLUE_BOLD + ":: Metodo size::" + Color.RESET);
        System.out.println("Total = " + persona.size());
        System.out.println(Color.BLUE_BOLD + ":: Metodo isEmpty::" + Color.RESET);
        System.out.println(Color.WHITE_UNDERLINED + "Contiene elementos = " + !persona.isEmpty() + Color.RESET);
        System.out.println(Color.BLUE_BOLD + ":: Metodo replace::" + Color.RESET);
        //persona.replace("Nombre", "Elias");
        //System.out.println("Actualizacion del nombre = " + persona);
        boolean b3 = persona.replace("Nombre", "Eliceo", "Elias");
        System.out.println("b3 = " + b3);
        System.out.println("Actualizacion del nombre con el valor viejo = " + persona);
    }
}
