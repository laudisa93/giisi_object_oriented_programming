package impar;

public class Main {

        public static void main(String[] args) {
            Impar ip = new Impar(5);
            System.out.println("El número impar es " + ip.getN());
            ip.setN(6);
            System.out.println("El número impar es " + ip.getN());
    }
}



