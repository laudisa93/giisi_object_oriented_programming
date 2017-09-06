
public class PruebaProducto {

    public static void main(String[] args) {
        Producto p = new Producto();//se crea un objeto de la clase producto llamado p
        Producto p2=new Producto();
        float precioTotal;
        p.setNombre("Cola-Cao");//p.nombre = "Cola-Cao"; //nombre,precio y unidades son atributos de la clase producto; p. lo que hace es acceder a todos los miembros que contiene la clase
        p.setPrecio(-10.5F);//p.precio = -10.5F;//se le pone F porque el atributo precio es float, y en java cualquier numero con decimales se declara como double, que es lo mismo q hacer un casting
        p.setUnidades(3);//p.unidades = 3;


        p2.setNombre("Cola-Cao 2Litros");
        p2.setPrecio(1.45F);
        p2.setUnidades(3);

        p.incrementarStock(20);
        p2.disminuirStock(1);


        precioTotal = p.getPrecio() * p.getUnidades();

        System.out.println("El precio del producto " + p.getNombre() + " es de "
                + p.getPrecio() + " Euros");
        System.out.println("Hay " + p.getUnidades() + " en stock, valoradas es "
                + precioTotal + " Euros");
    }
}
