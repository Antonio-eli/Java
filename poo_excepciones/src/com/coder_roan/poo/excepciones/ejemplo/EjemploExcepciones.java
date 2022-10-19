package com.coder_roan.poo.excepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero:");
        int divisor;
        double division;
        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10, divisor);
            System.out.println("division = " + division);
        } catch (NumberFormatException nfe){
            System.out.println(ANSI_RED + "Por favor ingrese un valor numérico: " + nfe.getMessage() + ANSI_RESET);
            main(args);
        } catch (DivisionPorZroException dze){
            System.out.println(ANSI_RED + "Capturamos la excepción en tiempo de ejecución: " + dze.getMessage() + ANSI_RESET);
            main(args);
        } finally {
            System.out.println(ANSI_YELLOW + "Es opcional, pero se ejecuta siempre con o sin excepción" + ANSI_RESET);
        }
        System.out.println("Continuamos con el flujo de la aplicación");
    }

}
