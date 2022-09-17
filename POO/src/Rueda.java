public class Rueda {
    private String fabricante;
    private int rin;
    private double ancho;

    public Rueda(String fabricante, int rin, double ancho) {
        this.fabricante = fabricante;
        this.rin = rin;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getRin() {
        return rin;
    }

    public double getAncho() {
        return ancho;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "fabricante='" + fabricante + '\'' +
                ", rin=" + rin +
                ", ancho=" + ancho +
                '}';
    }
}
