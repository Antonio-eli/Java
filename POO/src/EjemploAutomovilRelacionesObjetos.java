public class EjemploAutomovilRelacionesObjetos {
    //Color del texto
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\033[0;93m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

        Rueda[] ruedasSubaru = new Rueda[5];
        ruedasSubaru[0] = new Rueda("Michelin", 16,7.5);
        ruedasSubaru[1] = new Rueda("Michelin", 16,7.5);
        ruedasSubaru[2] = new Rueda("Michelin", 16,7.5);
        ruedasSubaru[3] = new Rueda("Michelin", 16,7.5);
        ruedasSubaru[4] = new Rueda("Michelin", 16,7.5);
        Persona conductorSubaru = new Persona("Eliceo", "Romero");
        Motor motorSubaru = new Motor(2.0, TipoMotor.GASOLINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSubaru);

        Rueda[] RuedasMazda = {
            new Rueda("Firestone", 18, 10.5),
            new Rueda("Firestone", 18, 10.5),
            new Rueda("Firestone", 18, 10.5),
            new Rueda("Firestone", 18, 10.5)
        };
        Persona conductorMazda = new Persona("Elias", "Romero");
        Motor motorMazda = new Motor(3.0, TipoMotor.GASOLINA);
        Automovil mazda = new Automovil("Mazda", "BT-50",  Color.ROJO, motorMazda);
        //mazda.setTanque(new Tanque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(conductorMazda);
        mazda.setRuedas(RuedasMazda);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Rueda[] RuedasNissan = {
                new Rueda("Dunlop ", 20, 11.5),
                new Rueda("Dunlop ", 20, 11.5),
                new Rueda("Dunlop ", 20, 11.5),
                new Rueda("Dunlop ", 20, 11.5)
        };
        Persona conductorNissan = new Persona("Raul", "Romero");
        Motor motorNissan = new Motor(3.5,TipoMotor.DIESEL);
        Automovil nissan  = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Tanque(), conductorNissan, RuedasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);



        Rueda[] RuedasRio = {
                new Rueda("Pirelli", 18, 10.5),
                new Rueda("Pirelli", 18, 10.5),
                new Rueda("Pirelli", 18, 10.5),
                new Rueda("Pirelli", 18, 10.5)
        };
        Persona conductorRio = new Persona("Eva", "Romero");
        Motor motorRio = new Motor(3.5, TipoMotor.GASOLINA);
        Automovil kia = new Automovil("kia", "Rio", Color.GRIS, motorRio, new Tanque(50),conductorRio, RuedasRio);
        kia.setTipo(TipoAutomovil.CONVERTIBLE);


        System.out.println(ANSI_GREEN  + subaru.detalle() + ANSI_RESET);
        System.out.println(ANSI_YELLOW + mazda.detalle()  + ANSI_RESET);
        System.out.println(ANSI_PURPLE + nissan.detalle() + ANSI_RESET);
        System.out.println(kia.detalle());
    }
}
