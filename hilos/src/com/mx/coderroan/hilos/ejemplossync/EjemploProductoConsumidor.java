package com.mx.coderroan.hilos.ejemplossync;

import com.mx.coderroan.hilos.ejemplossync.runnable.Consumidor;
import com.mx.coderroan.hilos.ejemplossync.runnable.Panadero;

public class EjemploProductoConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
