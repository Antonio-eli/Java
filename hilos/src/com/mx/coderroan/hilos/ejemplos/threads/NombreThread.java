package com.mx.coderroan.hilos.ejemplos.threads;
import com.mx.coderroan.hilos.ejemplos.Color;

import java.awt.*;

public class NombreThread extends Thread{
    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println( Color.CYAN_BOLD +"Inicia el metodo run del hilo: " + getName() + Color.RESET);

        for (int i = 0; i < 10; i++ ){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName());
        }

        System.out.println( Color.CYAN_BOLD +"Termina el hijo" + Color.RESET);
    }
}
