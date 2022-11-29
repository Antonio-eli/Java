package com.mx.coderroan.hilos.ejemplos;

import com.mx.coderroan.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Isla Cabo Santa Teresa")).start();
        new Thread(new ViajeTarea("Isla del Carmen")).start();
        new Thread(new ViajeTarea("Isla Quintín Aráuz")).start();
        new Thread(new ViajeTarea("Isla Cozumel")).start();
        new Thread(new ViajeTarea("Isla Cancún")).start();
    }
}
