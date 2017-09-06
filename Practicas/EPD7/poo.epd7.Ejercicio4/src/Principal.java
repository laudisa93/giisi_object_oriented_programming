
import poo.io.IO;

public class Principal {

    private static String invertirCadena(String cadena) {
        String res = "";
        int n = cadena.length();

        for (int i = n - 1; i >= 0; i--) {
            res += cadena.charAt(i);
        }
        return res;
    }

    private static String borrarEspacios(String cadena) {
        int i, n = cadena.length();
        String res = "";

        for (i = 0; i < n; i++) {
            if (cadena.charAt(i) != ' ') {
                res += cadena.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String cad, cadenaInvertida;
        System.out.println("Introduzca una cadena de caracteres: ");
        cad = IO.readLine();
        cadenaInvertida = invertirCadena(cad);

        System.out.println("Cadena antes: " + cad);
        System.out.println("Cadena después: " + cadenaInvertida);
        cad = borrarEspacios(cad);
        cadenaInvertida = borrarEspacios(cadenaInvertida);
        if (cad.equalsIgnoreCase(cadenaInvertida)) {
            System.out.println(cad + " es un palíndromo.");
        } else {
            System.out.println(cad + " no es un palíndromo.");
        }
    }
}
