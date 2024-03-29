package com.mx.coderroan.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            //private int contador = 3;

            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if( i > 0) {
                    toolkit.beep();
                    System.out.println("Tarea " + i +" periodica en: " + new Date() + " nombre del Thread: " + Thread.currentThread().getName());
                    //contador --;
                }else {
                    System.out.println("Finaliza el timepo");
                    timer.cancel();
                }
            }
        }, 5000, 10000);
        System.out.println("Agendamos una tarea inmediata que se repite cada 10 segundos...");

    }
}
