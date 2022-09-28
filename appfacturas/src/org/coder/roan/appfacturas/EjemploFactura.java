package org.coder.roan.appfacturas;

import org.coder.roan.appfacturas.modelo.*;

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
        System.out.println();

        for (int i=0; i<5; i++){
            producto = new Producto();

            System.out.println("Ingrese producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.println("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.println("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));
            System.out.println();
            s.nextLine();

        }

        System.out.println(factura);

    }
}
