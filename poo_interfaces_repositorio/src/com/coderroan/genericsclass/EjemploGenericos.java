package com.coderroan.genericsclass;

public class EjemploGenericos {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static <T> void imprimirCamion( Camion<T> camion ){
        for (T t: camion){
            if (t instanceof Animal){
                System.out.println(((Animal)t).getNombre() + " tipo: " + ((Animal)t).getTipo());
            }else if (t instanceof Automovil){
                System.out.println(((Automovil)t).getMarca());
            }else if (t instanceof Maquinaria){
                System.out.println(((Maquinaria)t).getTipo());
            }
        }
    }

    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Pegaso", "Caballo"));
        transporteCaballos.add(new Animal("Júpiter", "Caballo"));
        transporteCaballos.add(new Animal("Neptuno", "Caballo"));
        transporteCaballos.add(new Animal("Trueno", "Caballo"));
        transporteCaballos.add(new Animal("Príncipe", "Caballo"));
        System.out.println(ANSI_BLUE + "[ Transporte Caballos  ]" + ANSI_RESET);
        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transporteMaquinaria = new Camion<>(3);
        transporteMaquinaria.add(new Maquinaria("Excavadora"));
        transporteMaquinaria.add(new Maquinaria("Compactadora"));
        transporteMaquinaria.add(new Maquinaria("Retroexcavadora"));
        System.out.println(ANSI_BLUE + "[ Transporte Maquinaria  ]" + ANSI_RESET);
        imprimirCamion(transporteMaquinaria);

        Camion<Automovil> transporteAutomovil = new Camion<>(3);
        transporteAutomovil.add(new Automovil("Audi"));
        transporteAutomovil.add(new Automovil("BMW"));
        transporteAutomovil.add(new Automovil("Chevrolet"));
        System.out.println(ANSI_BLUE + "[ Transporte Automovil  ]" + ANSI_RESET);
        imprimirCamion(transporteAutomovil);
    }
}
