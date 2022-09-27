package org.coder.roan.appfacturas.modelo;

public class ItemFactura {
    private int cantida;
    private Producto producto;

    public ItemFactura(int cantida, Producto producto) {
        this.cantida = cantida;
        this.producto = producto;
    }

    public int getCantida() {
        return cantida;
    }

    public void setCantida(int cantida) {
        this.cantida = cantida;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
