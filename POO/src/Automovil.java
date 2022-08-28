public class Automovil {
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

    public String detalle() {
        return  "auto.fabricante = " + this.fabricante + "\n" +
                "auto.modelo = " + this.modelo + "\n" +
                "auto.color = " + this.color + "\n" +
                "auto.cilindrada = " + this.cilindrada + "\n";


    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " esta acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public  String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

}
