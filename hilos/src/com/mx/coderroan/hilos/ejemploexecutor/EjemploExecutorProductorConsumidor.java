package com.mx.coderroan.hilos.ejemploexecutor;

import com.mx.coderroan.hilos.ejemplossync.Panaderia;
import com.mx.coderroan.hilos.ejemplossync.runnable.Consumidor;
import com.mx.coderroan.hilos.ejemplossync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        System.out.println("Tama�o del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);

        System.out.println("Tama�o del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main");

    }
}
