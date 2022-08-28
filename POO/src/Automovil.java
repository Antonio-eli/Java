public class Automovil {
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private  int capacidadTanque = 40;

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

    public float calcularConusmo(int km, float porcentajeBencina){
        return km / ( capacidadTanque * porcentajeBencina );
    }
    //Sobre carga de metodos
    public float calcularConusmo(int km, int porcentajeBencina){
        return km / ( capacidadTanque * (porcentajeBencina / 100f) );
    }

    //Set y get

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }
}
