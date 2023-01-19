public class PrimitivosEnteros {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println(ANSI_GREEN + "numeroByte = " + numeroByte);
        System.out.println("El tipo de dato byte corresponde en byte a " + Byte.BYTES);
        System.out.println("El tipo de dato byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println(ANSI_YELLOW + "numeroShort = " + numeroShort);
        System.out.println("El tipo de dato Short corresponde en byte a " + Short.BYTES);
        System.out.println("El tipo de dato Short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un Short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un Short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println(ANSI_PURPLE + "numeroInt = " + numeroInt);
        System.out.println("El tipo de dato int corresponde en byte a " + Integer.BYTES);
        System.out.println("El tipo de dato int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLog = 9223372036854775807L;
        System.out.println(ANSI_GREEN + "numeroLog = " + numeroLog);
        System.out.println("El tipo de dato long corresponde en byte a " + Long.BYTES);
        System.out.println("El tipo de dato long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

        //var numeroVarL = 9223372036854775807L;
        //var numeroVarF = 9223372036854775807F;
       // var numeroVarD = 9223372036854775807D;
    }
}
