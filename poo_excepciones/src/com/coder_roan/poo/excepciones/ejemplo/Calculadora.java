package com.coder_roan.poo.excepciones.ejemplo;

public class Calculadora  {
    public double dividir(int numerador, int divisor) throws DivisionPorZroException {
        if (divisor == 0){
            throw new DivisionPorZroException("No se puede dividir por cero!");
        }
        return numerador /(double)divisor;
    }

    public double dividir(String numerador, String divisor) throws DivisionPorZroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        }catch (NumberFormatException nfe){
            throw new FormatoNumeroException("Por favor ingrese un valor numérico en el numerador y denominador: ");
        }


    }
}
