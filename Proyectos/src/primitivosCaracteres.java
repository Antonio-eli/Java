public class primitivosCaracteres {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter: " + caracter);
        System.out.println("decimal: " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        char simbolo = '@';
        System.out.println("simbolo: " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));
        char espacio = ' ';
        char retroceso= '\b';
        char tabulador= '\t';
        char nuevaLinea= '\n';
        char retornoCarro= '\r';
        System.out.println("retroceso: " + retroceso + retroceso);

        //Clase equivalente
        System.out.println(ANSI_GREEN + "El tipo de dato char corresponde en byte a \t" + Character.BYTES + System.lineSeparator());
        System.out.println("El tipo de dato char corresponde en bites a " + Character.SIZE);
        System.out.println("Valor maximo de un char: " + Character.MAX_VALUE + System.getProperty("line.separator"));
        System.out.println("Valor mínimo de un char: " + Character.MIN_VALUE);
        System.out.println(ANSI_RESET);
    }
}
