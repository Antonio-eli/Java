package com.mx.coderroan.hilos.ejemplos.runnable;

import com.mx.coderroan.hilos.ejemplos.Color;

public class ViajeTarea implements Runnable {
    private String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " - " + getNombre());
            try {
                Thread.sleep( (long)( Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Color.CYAN + "Finalmente me voy de viaje a: " + nombre + Color.RESET);
    }
}
