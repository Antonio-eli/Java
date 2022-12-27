package com.mx.coderroan.hilos.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutorFeature {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable tarea = ()->{
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del thread: "+ Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
        };
        executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecicion del metodo main");

    }
}
