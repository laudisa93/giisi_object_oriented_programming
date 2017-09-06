
public class Experimento1 {

    public static void main(String[] args) {
        Producto p;
        p = new Producto("Caja de galletas saladas", 2.35F, 200);
        //p.setNombre("Caja de galletas saladas");
        //p.setPrecio(2.35F);
        //p.setUnidades(200);
        p.incrementarStock(15);
        p.incrementarStock();
        p.disminuirStock(20);
        p.disminuirStock();
        System.out.println("Actualmente el stock del producto -" + p.getNombre()
                + "- es de " + p.getUnidades() + " unidades");
        System.out.println("El valor del stock del producto -" + p.getNombre()
                + "- es de " + p.valorEnStock() + " euros");
    }
}
