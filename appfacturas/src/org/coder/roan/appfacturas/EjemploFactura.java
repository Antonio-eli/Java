package org.coder.roan.appfacturas;

import org.coder.roan.appfacturas.modelo.Cliente;
import org.coder.roan.appfacturas.modelo.Factura;
import org.coder.roan.appfacturas.modelo.ItemFactura;
import org.coder.roan.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setRfc("ILA020311473");
        cliente.setNombre("Infoestratégica Latina S.A. de C.V.");

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();

        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;
        System.out.println();

        for (int i=0; i<5; i++){
            producto = new Producto();

            System.out.println("Ingrese producto nº " + producto.getCodigo() + ": ");
            nombre = s.nextLine();
            producto.setNombre(nombre);

            System.out.println("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.println("Ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);
            System.out.println();
            s.nextLine();

        }

        System.out.println(factura.generarDetalle());

    }
}
