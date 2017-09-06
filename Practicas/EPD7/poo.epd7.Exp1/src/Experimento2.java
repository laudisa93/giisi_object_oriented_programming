
public class Experimento2 {

    public static void main(String args[]) {
        String cad1 = "En un lugar de la mancha";
        String cad2 = new String("En un lugar de la mancha");
        System.out.println("Cadena 1: " + cad1);
        System.out.println("Cadena 2: " + cad2);
        if (cad1.equals(cad2)) {
            System.out.println("Las dos cadenas son iguales");
        } else {
            System.out.println("Las dos cadenas son diferentes");
        }
    }
}
