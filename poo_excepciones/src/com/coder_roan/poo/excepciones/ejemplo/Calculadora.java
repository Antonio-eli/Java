package com.coder_roan.poo.excepciones.ejemplo;

public class Calculadora  {
    public double dividir(int numerador, int divisor) throws DivisionPorZroException {
        if (divisor == 0){
            throw new DivisionPorZroException("No se puede dividir por cero!");
        }
        return numerador /(double)divisor;
    }
}
