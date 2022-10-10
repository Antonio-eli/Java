package com.coderroan.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{
    protected String mensaje = ANSI_RED + "el campo debe ser un n�mero" + ANSI_RESET;
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
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e){
            System.out.println("Error no es un numero: " + e);
            return false;
        }

    }
}
