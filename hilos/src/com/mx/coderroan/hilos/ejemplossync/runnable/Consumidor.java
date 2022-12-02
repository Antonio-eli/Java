package com.mx.coderroan.hilos.ejemplossync.runnable;

import com.mx.coderroan.hilos.ejemplossync.Panaderia;

public class Consumidor implements Runnable{
    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {

    }
}
