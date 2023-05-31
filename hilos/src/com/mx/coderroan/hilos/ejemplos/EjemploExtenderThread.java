package com.mx.coderroan.hilos.ejemplos;

import com.mx.coderroan.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Eliceo Romero");
        hilo.start();
        //Thread.sleep(100);
        Thread hilo2 = new NombreThread("Sonia Gonzalez");
        hilo2.start();

        Thread hilo3 = new NombreThread("Pepe Martinez");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
