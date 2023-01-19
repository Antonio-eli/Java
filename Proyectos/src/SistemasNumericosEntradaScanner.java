import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        //instancia de la clase
        Scanner scanner = new Scanner( System.in);
        System.out.println("Ingrese un numero entero:");
        //String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try {
                numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar un número!");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexadecimal = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        System.out.println(mensaje);
    }
}
