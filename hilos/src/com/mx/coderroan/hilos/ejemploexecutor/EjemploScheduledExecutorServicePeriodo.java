package com.mx.coderroan.hilos.ejemploexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduledExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        System.out.println("Alguna tarea en el main");
        AtomicInteger contador = new AtomicInteger(5);
        //CountDownLatch look = new CountDownLatch(5);
        Future<?> future = executor.scheduleAtFixedRate(()-> {
            System.out.println("Hola mundo tarea ...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //look.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 1000, 2000, TimeUnit.MILLISECONDS);
        //look.await();
        while (contador.get() > 0){
            if (contador.get() == 0){
                future.cancel(true);
                contador.getAndDecrement();
            }
        }
        future.cancel(true);
        //TimeUnit.SECONDS.sleep(10);
        System.out.println("Alguna otra tarea en el main");
        executor.shutdown();
    }
}
