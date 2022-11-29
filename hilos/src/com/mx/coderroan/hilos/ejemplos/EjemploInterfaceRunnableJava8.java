package com.mx.coderroan.hilos.ejemplos;

import com.mx.coderroan.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {
        Runnable viaje = () -> {
                for (int i = 0; i <= 10; i++){
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep( (long)( Math.random() * 1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Color.CYAN + "Finalmente me voy de viaje a: " + Thread.currentThread().getName() + Color.RESET);
        };

        new Thread(viaje, "Isla Cabo Santa Teresa").start();
        new Thread(viaje,"Isla del Carmen").start();
        new Thread(viaje,"Isla Quintín Aráuz").start();
        new Thread(viaje,"Isla Cozumel").start();
        new Thread(viaje,"Isla Cancún").start();
    }
}
