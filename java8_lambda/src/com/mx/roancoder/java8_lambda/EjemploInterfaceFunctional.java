package com.mx.roancoder.java8_lambda;

import com.mx.roancoder.java8_lambda.aritmetica.Aritmetica;
import com.mx.roancoder.java8_lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
        Aritmetica suma = (a ,b) -> a + b;
        Aritmetica resta = (a ,b) -> a - b;

        Calculadora cal = new Calculadora();
        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5, (a, b) -> a * b));
        System.out.println(cal.computarBiFunction(10, 5, (a, b) -> a + b));
    }
}
