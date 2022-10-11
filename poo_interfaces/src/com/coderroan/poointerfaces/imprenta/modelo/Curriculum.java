package com.coderroan.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja{
    private String persona;
    private String carrera;
    private List<String> experiencia;
    public Curriculum(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencia){
        experiencia.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona)
                .append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n")
                .append("Profesion: ").append(this.carrera)
                .append("\n")
                .append("Experiencia: \n");
        for (String experiencia: this.experiencia){
            sb.append("- ").append(experiencia).append("\n");
        }
        return sb.toString();
    }
}
