public class HolaMundo {
    //Color del texto
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    //Color BACKGROUND
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void main(String[] args) {

        String Saludar = "Hola Mundo desde java!";
        System.out.println("Saludar.toUpperCase() = " + Saludar.toUpperCase());

        int numeroPrimitivo = 11;
        Integer numeroClase = 10;
        System.out.println(ANSI_PURPLE + "numeroPrimitivo = " + numeroPrimitivo);
        System.out.println(ANSI_YELLOW + "numeroClase = " + numeroClase.hashCode());


        boolean valor = true;
        Integer numeroPrimitivo3;
        if (valor){
            System.out.println("valor = " + valor);
            Integer numeroPrimitivo2 = 2022;
            numeroPrimitivo3 = 2023;
            System.out.println(ANSI_PURPLE + "numeroPrimitivo2 = " + numeroPrimitivo2);
            System.out.println("numeroPrimitivo3 = " + numeroPrimitivo3);

        }
        //Como podemos observar la variable numeroPrimitivo2 no la podemos utilizar fuera de su contexto
        //System.out.println("numeroPrimitivo2 = " + numeroPrimitivo2);

        //Nueva forma de crear variables
        var tipoFlexibleDeVariable = "10";
        System.out.println(ANSI_GREEN + "tipoFlexibleDeVariable = " + tipoFlexibleDeVariable + ANSI_RESET);
    }

}
