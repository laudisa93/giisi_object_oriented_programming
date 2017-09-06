
public class Experimento3a {

    public static void main(String[] args) {
        Impar ip;
        ip = new Impar(5);
        System.out.println("El número impar es " + ip.getN());
        ip.setN(6);
        System.out.println("El número impar es " + ip.getN());
    }
}
