
package producto;

public class Main {

    public static void main(String[] args) {
        Producto p, q;
        p = new Producto("Caja de galletas saladas", 2.35F, 200);
        q = new Producto("Paquete Azucar 1Kg", 1.50F, 300);
        Producto.setIva(16);
        System.out.println("El producto -" + p.getNombre() + "- cuyo precio es "
                + p.getPrecio() + " euros tiene un " + " cargo por I.V.A. al 16% de "
                + p.calculaIva() + " euros.");
        Producto.setIva(16);
        System.out.println("El precio con I.V.A. incluido del producto -" + p.getNombre()
                + "- es de " + p.precioConIva() + " euros.");
        System.out.println("El precio I.V.A. incluido del producto -" + q.getNombre()
                + "- es de " + q.precioConIva() + " euros.");
    }
}
