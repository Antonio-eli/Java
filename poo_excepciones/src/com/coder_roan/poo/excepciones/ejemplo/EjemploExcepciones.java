package com.coder_roan.poo.excepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador:");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador:");
        try {
            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        } catch (FormatoNumeroException fne){
            System.out.println(ANSI_RED + "Se detecto una excepci�n: ingrese un n�mero v�lido\n" + fne.getMessage() + ANSI_RESET);
            fne.printStackTrace();
        } catch (DivisionPorZroException dze){
            System.out.println(ANSI_RED + "Capturamos la excepci�n en tiempo de ejecuci�n: " + dze.getMessage() + ANSI_RESET);
            main(args);
        } finally {
            System.out.println(ANSI_YELLOW + "Es opcional, pero se ejecuta siempre con o sin excepci�n" + ANSI_RESET);
        }
        System.out.println("Continuamos con el flujo de la aplicaci�n");
    }

}
