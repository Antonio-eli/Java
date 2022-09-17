import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploAutomovilArreglo {
    //Color del texto
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\033[0;93m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.GASOLINA);
        Persona conductorSubaru = new Persona("Eliceo", "Romero");
        Automovil subaru = new Automovil("Subaru", "Impreza", Color.BLANCO, motorSubaru, new Tanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Motor motorMazda = new Motor(3.0, TipoMotor.GASOLINA);
        Persona conductorMazda = new Persona("Elias", "Romero");
        Automovil mazda = new Automovil("Mazda", "BT-50",  Color.ROJO, motorMazda, new Tanque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(conductorMazda);

        Motor motorNissan = new Motor(3.5,TipoMotor.DIESEL);
        Persona conductorNissan = new Persona("Raul", "Romero");
        Automovil nissan  = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Tanque());
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(conductorNissan);

        Motor motorRio = new Motor(3.5, TipoMotor.GASOLINA);
        Persona conductorRio = new Persona("Eva", "Romero");
        Automovil kia = new Automovil("kia", "Rio", Color.GRIS, motorRio, new Tanque(50));
        kia.setTipo(TipoAutomovil.CONVERTIBLE);
        kia.setConductor(conductorRio);

        Automovil[] autos = new Automovil[4];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = kia;
        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }

    }
}
