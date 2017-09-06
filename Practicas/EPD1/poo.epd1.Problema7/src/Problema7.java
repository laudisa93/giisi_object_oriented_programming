import poo.io.IO;
/*Escriba un programa que, dado un número entero por parte del usuario, calcule el factorial del mismo y
 lo muestre por pantalla.*/

public class Problema7 {

    public static void main(String[] args) {
        int numero, i, factorial = 1;
        System.out.println("Introduzca un número: ");
        numero = (int) IO.readNumber();
        for (i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial es " + factorial);
    }
}
