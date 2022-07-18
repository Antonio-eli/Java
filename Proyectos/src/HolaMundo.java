public class HolaMundo {
    //Color del texto
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

        String Saludar = "Hola Mundo desde java!";
        System.out.println("Saludar.toUpperCase() = " + Saludar.toUpperCase());

        int numeroPrimitivo = 11;
        Integer numeroClase = 10;
        System.out.println(ANSI_PURPLE + "numeroPrimitivo = " + numeroPrimitivo);
        System.out.println("numeroClase = " + numeroClase.hashCode());


        boolean valor = true;
        Integer numeroPrimitivo3;
        if (valor){
            System.out.println("valor = " + valor);
            Integer numeroPrimitivo2 = 2022;
            numeroPrimitivo3 = 2023;
            System.out.println("numeroPrimitivo2 = " + numeroPrimitivo2);
            System.out.println("numeroPrimitivo3 = " + numeroPrimitivo3);

        }
        //Como podemos observar la variable numeroPrimitivo2 no la podemos utilizar fuera de su contexto
        //System.out.println("numeroPrimitivo2 = " + numeroPrimitivo2);

        //Nueva forma de crear variables
        var tipoFlexibleDeVariable = "10";
        System.out.println("tipoFlexibleDeVariable = " + tipoFlexibleDeVariable + ANSI_RESET);
        /*Reglas de variables*/
        String nombre;
        String nivelProgramacion = "programador Jr";
        var numero = 9;
        nombre = "Eliceo" + " " + nivelProgramacion;
        if (numero >= 10 ){
            nivelProgramacion = "programador Senior";
            nombre = "Eliceo" + " " + nivelProgramacion;
            System.out.println(ANSI_YELLOW + "nombre = " + nombre);
        } else {
            System.out.println(ANSI_YELLOW + "nombre = " + nombre);
        }
    }

}
