package com.coderroan.pooclasesabstractas.form.validador;

import com.coderroan.pooclasesabstractas.form.validador.mensaje.IMensajeFormateable;

public class LargoValidador extends Validador implements IMensajeFormateable {
    protected String mensaje = ANSI_RED + "el campo %s debe tener minimo %d caracteres %d caracteres" + ANSI_RESET;
    private int minimo = 0;
    private int maximo = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

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
        //this.mensaje = String.format(this.mensaje, this.minimo, this.maximo);
        if(valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= minimo && largo <= maximo);
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.minimo, this.maximo);
    }
}
