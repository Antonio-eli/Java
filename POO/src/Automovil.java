public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private  int capacidadTanque = 40;

    private static Color colorPatente = Color.NARANJA;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS_OSCURO = "Gris oscuro";

    public  Automovil(){
        this.id = ++ultimoId;
    }
    public Automovil(String fabricante, String modelo){
         this();
         this.fabricante = fabricante;
         this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String detalle() {
        return  "auto.id = " + this.id + "\n" +
                "auto.fabricante = " + this.fabricante + "\n" +
                "auto.modelo = " + this.modelo + "\n" +
                "auto.color = " + this.color.getColor() + "\n" +
                "auto.colorPatente = " + colorPatente.getColor() + "\n" +
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

    public float calcularConsumo(int km, float porcentajeBencina){
        return km / ( capacidadTanque * porcentajeBencina );
    }
    //Sobre carga de metodos
    public float calcularConsumo(int km, int porcentajeBencina){
        return km / ( capacidadTanque * (porcentajeBencina / 100f) );
    }

    public static float calcularConusmoEstatico(int km, int porcentajeBencina){
        return km / ( capacidadTanqueEstatico * (porcentajeBencina / 100f) );
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //Sobre escritura del metodo equals

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Automovil)){
            return false;
        }
        Automovil auto = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(auto.getFabricante())
                && this.modelo.equals(auto.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
