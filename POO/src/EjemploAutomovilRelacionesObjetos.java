public class EjemploAutomovilRelacionesObjetos {
    //Color del texto
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\033[0;93m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Eliceo", "Romero");
        Motor motorSubaru = new Motor(2.0, TipoMotor.GASOLINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSubaru);
        Rueda[] ruedasSubaru = new Rueda[5];
        for(int i = 0; i < ruedasSubaru.length; i++){
            subaru.addRueda(new Rueda("Michelin", 16,7.5));
        }

        Persona conductorMazda = new Persona("Elias", "Romero");
        Motor motorMazda = new Motor(3.0, TipoMotor.GASOLINA);
        Automovil mazda = new Automovil("Mazda", "BT-50",  Color.ROJO, motorMazda, new Tanque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(conductorMazda);
        Rueda[] RuedasMazda = new Rueda[5];
        for(int i = 0; i < RuedasMazda.length; i++){
            mazda.addRueda(new Rueda("Michelin", 16,7.5));
        }

        Persona conductorNissan = new Persona("Raul", "Romero");
        Motor motorNissan = new Motor(3.5,TipoMotor.DIESEL);
        Automovil nissan  = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Tanque());
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(conductorNissan);
        nissan.addRueda(new Rueda("Michelin", 16,7.5))
                .addRueda(new Rueda("Michelin", 16,7.5))
                .addRueda(new Rueda("Michelin", 16,7.5))
                .addRueda(new Rueda("Michelin", 16,7.5))
                .addRueda(new Rueda("Michelin", 16,7.5));


        Persona conductorRio = new Persona("Eva", "Romero");
        Motor motorRio = new Motor(3.5, TipoMotor.GASOLINA);
        Automovil kia = new Automovil("kia", "Rio", Color.GRIS, motorRio, new Tanque(50));
        kia.setTipo(TipoAutomovil.CONVERTIBLE);
        kia.setConductor(conductorRio);
        Rueda[] RuedasRio = new Rueda[5];
        for(int i = 0; i < RuedasRio.length; i++){
            kia.addRueda(new Rueda("Michelin", 16,7.5));
        }


        System.out.println(ANSI_GREEN  + subaru.detalle() + ANSI_RESET);
        System.out.println(ANSI_YELLOW + mazda.detalle()  + ANSI_RESET);
        System.out.println(ANSI_PURPLE + nissan.detalle() + ANSI_RESET);
        System.out.println(kia.detalle());
    }
}
