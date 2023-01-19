public class EjemploAutomovilStatic {
    //Color del texto
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\033[0;93m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Automovil.setCapacidadTanqueEstatico(45);

        Motor motorSubaru = new Motor(2.0, TipoMotor.GASOLINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Motor motorMazda = new Motor(3.0, TipoMotor.GASOLINA);
        Automovil mazda = new Automovil("Mazda", "BT-50",  Color.ROJO, motorMazda);
        //mazda.setTanque(new Tanque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Motor motorNissan = new Motor(3.5,TipoMotor.DIESEL);
        Automovil nissan  = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Tanque());
        nissan.setTanque(new Tanque());
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);

        Motor motorRio = new Motor(3.5, TipoMotor.GASOLINA);
        Automovil kia = new Automovil("kia", "Rio", Color.GRIS, motorRio, new Tanque(50));
        kia.setTanque(new Tanque());
        kia.setColor(Color.AMARILO);
        kia.setTipo(TipoAutomovil.CONVERTIBLE);


        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(kia.detalle());
        System.out.println("Automovil.getColorPatente(): " + Automovil.getColorPatente().getColor());

        //Clase static Atributos y metodos estaticos
        Automovil.setCapacidadTanqueEstatico(45);
        System.out.println( "Automovil.calcularConusmoEstatico() = " + Automovil.calcularConusmoEstatico(300, 60));
        System.out.println( "mazda.calcularConusmoEstatico() = " + mazda.calcularConsumo(300, 60));
        System.out.println("Velocidad maxima carretera " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad " + Automovil.VELOCIDAD_MAX_CIUDAD);

        //Implemetando enumerador con mas atributos
       TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println(ANSI_YELLOW + "tipoSubaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipoSubaru.getDescripcion() + ANSI_RESET);
    }
}
