package com.mx.coderroan.hilos.ejemplossync;

import com.mx.coderroan.hilos.ejemplossync.runnable.Consumidor;
import com.mx.coderroan.hilos.ejemplossync.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductoConsumidorJava8 {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(()->{
            for(int i = 0; i < 10; i++){
                p.hornear("Pan n°: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i<10; i++){
                p.consumir();
            }
        }).start();

    }
}
