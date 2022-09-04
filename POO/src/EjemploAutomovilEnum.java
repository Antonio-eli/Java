public class EjemploAutomovilEnum {
    //Color del texto
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\033[0;93m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Automovil.setCapacidadTanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50",  Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        //Implemetando enumerador con mas atributos
        TipoAutomovil tipo = subaru.getTipo();
        System.out.println(ANSI_YELLOW + "tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipo.getDescripcion() + ANSI_RESET);

        //Utilizando enum con sentencias switch case
        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE ->
                System.out.println("El automóvil es deportivo con un motor V6, de dos puertas");
            case COUPE ->
                System.out.println("El automóvil es pequeño de dos puertas");
            case FURGON ->
                System.out.println("El automóvil destinado al transporte de empresas");
            case HATCHBACK ->
                System.out.println("El automóvil pequeño con aspeto deportivo");
            case PICKUP ->
                System.out.println("Es un tipo de camioneta empleada generalmente para el transporte de mercancías");
            case SEDAN ->
                System.out.println("Es un tipo automóvil empleado para viajes largos dentro de la ciudad");
            case STATION_WAGON ->
                System.out.println("Es un tipo automóvil empleado para el transporte familiar");
        }

        //Iterando enum con foreach
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos){
            System.out.println(ta + " => " +
                    ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas());
            System.out.println();
        }
    }
}
