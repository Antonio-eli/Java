public class primitivosFloat {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    static float numeroTipoFlotante;
    public static void main(String[] args) {
        float numeroFloat = 2.12e3F;  //2120F
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("El tipo de dato float corresponde en byte a: " + Float.BYTES);
        System.out.println("El tipo de dato float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);

        double numeroDouble = 3.4028235E38;
        System.out.println(ANSI_GREEN + "numeroDouble = " + numeroDouble);
        System.out.println("El tipo de dato double corresponde en byte a: " + Double.BYTES);
        System.out.println("El tipo de dato double corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE + ANSI_RESET);

        //float numeroTipoFlotante = 3.4028235E37F;
        System.out.println("numeroTipoFlotante = " + numeroTipoFlotante);
    }
}
