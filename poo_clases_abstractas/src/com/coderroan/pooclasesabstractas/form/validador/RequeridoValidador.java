package com.coderroan.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador{
    protected String mensaje = ANSI_RED + "el campo %s es requerido" + ANSI_RESET;
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null && valor.length() > 0);
    }
}
