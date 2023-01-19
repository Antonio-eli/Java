import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
                numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        String resultadoHexadecimal = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
