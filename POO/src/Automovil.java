public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

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
        this.ruedas = new Rueda[5];
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

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String detalle() {
        String detalle ="auto.id = " + this.id + "\n";
        if(this.getConductor() != null){
            detalle += "auto.getConductor = " + this.getConductor() + "\n";
        }
            detalle += "auto.fabricante = " + this.getFabricante() + "\n" +
                        "auto.modelo = " + this.getModelo() + "\n";
        if (this.getTipo() != null){
             detalle += "auto.tipo = " + this.getTipo().getDescripcion();
        }
             detalle += "auto.color = " + this.color.getColor() + "\n" +
                        "auto.colorPatente = " + colorPatente.getColor() + "\n";
        if (this.getMotor() != null){
            detalle +="auto.cilindrada = " + this.motor.getCilindrada() + "\n";
        }
        if (this.getRuedas() != null){
            for (Rueda rueda: this.getRuedas()){
                detalle += "\n" + "Fabricante de Ruedas: " + rueda.getFabricante() + "\n" +
                           "Rin de Rueda: " + rueda.getRin() + "\n" +
                           "Ancho de Rueda: " + rueda.getAncho();
            }
        }


        return detalle;
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
        return km / ( this.getTanque().getCapacidad() * porcentajeBencina );
    }
    //Sobre carga de metodos
    public float calcularConsumo(int km, int porcentajeBencina){
        return km / ( this.getTanque().getCapacidad() * (porcentajeBencina / 100f) );
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

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        if (tanque == null){
            this.tanque = new Tanque();
        }
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda) {
        if (indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
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
                ", cilindrada=" + motor +
                ", capacidadTanque=" + tanque +
                '}';
    }
}
