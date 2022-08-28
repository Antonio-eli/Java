public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilometros por litro " + subaru.calcularConusmo(300, 0.6f));
        System.out.println("Kilometros por litro " + subaru.calcularConusmo(300, 60));
    }
}
