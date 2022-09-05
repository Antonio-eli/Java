import java.util.Date;

public class EjemploAutomovil {
    //Color del texto
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\033[0;93m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Date fecha = new Date();

        Motor motorSubaru = new Motor(2.0, TipoMotor.GASOLINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);

        Motor motorMazda = new Motor(3.0, TipoMotor.GASOLINA);
        Automovil mazda = new Automovil("Mazda", "BT-50",  Color.ROJO, motorMazda);
        mazda.setTanque(new Tanque());
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Motor motorNissan = new Motor(3.5,TipoMotor.DIESEL);
        Automovil nissan  = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Tanque());

        Motor motorRio = new Motor(3.5, TipoMotor.GASOLINA);
        Automovil kia = new Automovil("kia", "Rio", Color.GRIS, motorRio, new Tanque(50));

        System.out.println("Son iguales: " + ( nissan == kia ) );
        System.out.println(ANSI_GREEN + "Son iguales con equals :: " + ( nissan.equals( kia ) ) );
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
        System.out.println("Kilometros por litro subaru " + subaru.calcularConsumo(300, 0.6f));
        //Implementacion con sobre carga de metodos
        System.out.println("Kilometros por litro de subaru " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilometros por litro de nissan " + nissan.calcularConsumo(300, 60));
    }
}
