public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50",  "Rojo", 3.0);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilometros por litro subaru " + subaru.calcularConusmo(300, 0.6f));
        //Implementacion con sobre carga de metodos
        System.out.println("Kilometros por litro de subaru " + subaru.calcularConusmo(300, 60));
        System.out.println("Kilometros por litro de nissan " + nissan.calcularConusmo(300, 60));
    }
}
