import java.util.Date;

public class EjemploAutomovil {
    //Color del texto
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\033[0;93m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Date fecha = new Date();
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50",  "Rojo", 3.0);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan  = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil kia = new Automovil();
        System.out.println("Son iguales: " + ( nissan == nissan2 ) );
        System.out.println(ANSI_GREEN + "Son iguales con equals :: " + ( nissan.equals( nissan2 ) ) );
        System.out.println("Son iguales con equals :: " + ( kia.equals( nissan ) ) );
        System.out.println("Son iguales con equals :: " + ( kia.equals( fecha ) ) + ANSI_RESET);
        System.out.println(ANSI_YELLOW + nissan );
        System.out.println(nissan.toString() + ANSI_RESET);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilometros por litro subaru " + subaru.calcularConusmo(300, 0.6f));
        //Implementacion con sobre carga de metodos
        System.out.println("Kilometros por litro de subaru " + subaru.calcularConusmo(300, 60));
        System.out.println("Kilometros por litro de nissan " + nissan.calcularConusmo(300, 60));
    }
}
