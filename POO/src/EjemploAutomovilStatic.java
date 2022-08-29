public class EjemploAutomovilStatic {
    //Color del texto
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\033[0;93m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50",  "Rojo", 3.0);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan  = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil.setColorPatente("Azul");
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil kia = new Automovil();


        System.out.println(subaru.detalle());
        System.out.println( mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println("Automovil.getColorPatente(): " + Automovil.getColorPatente());
        //Clase static
        Automovil.setCapacidadTanqueEstatico(45);
        System.out.println(ANSI_YELLOW + "Automovil.calcularConusmoEstatico() = " + Automovil.calcularConusmoEstatico(300, 60) + ANSI_RESET);

    }
}
