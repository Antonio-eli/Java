package com.coderroan.pooclasesabstractas.form.validador;

public class NoNuloValidador extends Validador{
    protected String mensaje = ANSI_RED + "el campo no puede ser nulo" + ANSI_RESET;
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
        return (valor != null);
    }
}
