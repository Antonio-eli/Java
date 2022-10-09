package com.coderroan.pooclasesabstractas.form;

import com.coderroan.pooclasesabstractas.form.elementos.ElementoForm;
import com.coderroan.pooclasesabstractas.form.elementos.InputForm;
import com.coderroan.pooclasesabstractas.form.elementos.SelectForm;
import com.coderroan.pooclasesabstractas.form.elementos.TextareaForm;
import com.coderroan.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email    = new InputForm("email", "email");
        InputForm edad     = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp",5,9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "Php"));

        username.setValor("Eliceo.roan");
        password.setValor("1234");
        email.setValor("eliceoroan@gmail.com");
        edad.setValor("24");
        experiencia.setValor(".. M�s de 10 a�os de experiencia ..");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,password,email,edad,experiencia,lenguaje);
        /*for (ElementoForm elemento: elementos){
            System.out.println(elemento.dibujarHtml());
            System.out.println("<br>");
        }*/
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
    }

}
