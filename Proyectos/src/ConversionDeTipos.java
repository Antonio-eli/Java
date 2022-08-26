public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBolean = " + logicoBolean);

        //Conversiones de tipo primitivos a cadenas de texto

        int otroNumeroInt = 100;
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        /*valueOf recibe int, String puede tener un comportamiento raro dependiendo
          De los parámetros que se pasen */
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32768;
        short s = (short) i;
        System.out.println(Short.MAX_VALUE);
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        float f = i;
        System.out.println("f = " + f);


    }
}
