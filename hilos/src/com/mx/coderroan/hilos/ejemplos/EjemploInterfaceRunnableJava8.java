package com.mx.coderroan.hilos.ejemplos;

import com.mx.coderroan.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
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
                System.out.println(main.getState());
        };

        Thread v1 = new Thread(viaje, "Isla Cabo Santa Teresa");
        Thread v2 = new Thread(viaje,"Isla del Carmen");
        Thread v3 = new Thread(viaje,"Isla Quintín Aráuz");
        Thread v4 = new Thread(viaje,"Isla Cozumel");
        Thread v5 = new Thread(viaje,"Isla Cancún");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();
        v5.join();

        //Thread.sleep(5000);
        System.out.println(Color.BLUE_BOLD + "Continuando con la ejecución del método main: " + main.getName() + Color.RESET);

    }
}
