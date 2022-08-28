public class Automovil {
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " + this.fabricante + "\n");
        sb.append("auto.modelo = " + this.modelo + "\n");
        sb.append("auto.color = " + this.color + "\n");
        sb.append("auto.cilindrada = " + this.cilindrada + "\n");

        return sb.toString();
    }

}
