package com.coderroan.genericsclass;

public class EjemploGenericos {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("Pegaso", "Caballo"));
        transporteCaballos.add(new Animal("Júpiter", "Caballo"));
        transporteCaballos.add(new Animal("Neptuno", "Caballo"));
        transporteCaballos.add(new Animal("Trueno", "Caballo"));
        transporteCaballos.add(new Animal("Príncipe", "Caballo"));
        System.out.println(ANSI_BLUE + "[ Transporte Caballos  ]" + ANSI_RESET);
        for(Object o: transporteCaballos){
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }

        Camion transporteMaquinaria = new Camion(3);
        transporteMaquinaria.add(new Maquinaria("Excavadora"));
        transporteMaquinaria.add(new Maquinaria("Compactadora"));
        transporteMaquinaria.add(new Maquinaria("Retroexcavadora"));
        System.out.println(ANSI_BLUE + "[ Transporte Maquinaria  ]" + ANSI_RESET);
        for (Object o: transporteMaquinaria){
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        Camion transporteAutomovil = new Camion(3);
        transporteAutomovil.add(new Automovil("Audi"));
        transporteAutomovil.add(new Automovil("BMW"));
        transporteAutomovil.add(new Automovil("Chevrolet"));
        System.out.println(ANSI_BLUE + "[ Transporte Automovil  ]" + ANSI_RESET);
        for (Object o: transporteAutomovil){
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());
        }
    }
}
