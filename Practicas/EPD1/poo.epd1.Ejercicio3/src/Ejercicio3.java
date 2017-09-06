
import poo.io.IO;

/*Escriba un programa que, dado un número entero por parte del usuario, nos devuelva la cifra
 correspondiente a las unidades de dicho número. Por ejemplo, si el usuario introduce el número 1534,
 el programa nos debe de decir que la cifra de unidades de ese número es 4. Para ello, dado un número
 se le restará 10 hasta que el resultado sea menor que diez, correspondiendo dicho
resultado al número de unidades.*/

public class Ejercicio3 {
    public static void main (String[] args){
        int x;
        System.out.println("Introduzca un número: ");
        x = (int)IO.readNumber();
        while(x>=10){
            x = x - 10;
        }
        System.out.println("Su cifra de unidades es " + x);
    }
   
}