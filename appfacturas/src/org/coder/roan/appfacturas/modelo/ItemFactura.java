package org.coder.roan.appfacturas.modelo;

public class ItemFactura {
    private int cantidad;
    private Producto producto;

    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantida) {
        this.cantidad = cantida;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float calcularImporte() {
        return this.cantidad * this.producto.getPrecio();
    }

    @Override
    public String toString() {
        return producto.toString() +
                "\t" + cantidad +
                "\t" + calcularImporte();
    }
}
