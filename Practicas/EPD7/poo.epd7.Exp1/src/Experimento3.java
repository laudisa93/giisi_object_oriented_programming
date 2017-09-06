
public class Experimento3 {

    public static void main(String args[]) {
        String cad1 = "Universidad Pablo de Olavide";
        String cad2 = cad1.toUpperCase();
        System.out.println("Cadena 1: " + cad1);
        System.out.println("Cadena 2: " + cad2);
        System.out.println("Minúsculas: " + cad1.toLowerCase());
        if (cad1.equalsIgnoreCase(cad2)){
            System.out.println("Las dos cadenas son iguales sin diferenciar " + "mayúsculas de minúsculas");
            System.out.println("La cadena tiene " + cad1.length() + " caracteres");
            System.out.println("Acrónimo: " + cad1.charAt(0) + cad1.charAt(12)
                    + cad1.charAt(21));
            System.out.println("En Inglés: " + cad1.substring(12) + " University");
        }

    }
}

