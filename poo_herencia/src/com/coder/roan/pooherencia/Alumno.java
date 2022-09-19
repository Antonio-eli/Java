package com.coder.roan.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematicas;
    private double notaCiencias;
    private double notaIngles;

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCiencias() {
        return notaCiencias;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }
}
