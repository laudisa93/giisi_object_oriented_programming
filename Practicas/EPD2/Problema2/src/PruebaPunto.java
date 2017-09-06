
public class PruebaPunto {
    public static void main (String[] args){
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        p1.setX(5);
        p1.setY(3);
        p2.distanciaEuclidea(p1);
        System.out.println("Distancia euclidea = " + p2.distanciaEuclidea(p1));
        p1.imprimir();
    }
}
