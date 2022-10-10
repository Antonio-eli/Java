package com.coderroan.pooclasesabstractas.form;
import com.coderroan.pooclasesabstractas.form.elementos.*;
import com.coderroan.pooclasesabstractas.form.elementos.select.Opcion;
import com.coderroan.pooclasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador()).addValidador(new LargoValidador(6, 12));
        InputForm email    = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador()).addValidador(new EmailValidador());
        InputForm edad     = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());
        TextareaForm experiencia = new TextareaForm("exp",5,9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript").setSelected())
                .addOpcion(new Opcion("5", "Php"));

        ElementoForm saludar = new ElementoForm("Saludo") {
            @Override
            public String dibujarHtml() {
                  return "<input disabled name='" + this.nombre + "' value=\"" + this.valor + "\" >";

            }
        };

        saludar.setValor("Hola que tal este campo esta deshabilitado");
        username.setValor("Eliceo.roan");
        password.setValor("123456");
        email.setValor("eliceoroan@gmail.com");
        edad.setValor("24");
        experiencia.setValor(".. Más de 10 años de experiencia ..");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,password,email,edad,experiencia,lenguaje,saludar);
        /*for (ElementoForm elemento: elementos){
            System.out.println(elemento.dibujarHtml());
            System.out.println("<br>");
        }*/
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if (!e.esValido()){
                e.getErrores().forEach(err -> System.out.println(e.getNombre() + ": " + err));
            }
        });
    }

}
