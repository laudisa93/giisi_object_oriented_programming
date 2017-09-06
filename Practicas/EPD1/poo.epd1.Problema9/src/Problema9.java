
import poo.io.IO;

/*
 * Escriba un programa que pida números hasta que el usuario introduzca el cero.
 * Una vez introducido el cero, el programa deberá imprimir en pantalla el valor
 * medio y la varianza de los números que se han ido introduciendo, excluyendo
 * el cero.
 */
public class Problema9 {

    public static void main(String[] args) {
        int contador = 0, num, suma = 0, suma2 = 0;
        float media, varianza;
        do {
            System.out.println("Introduzca un número: ");
            num = (int) IO.readNumber();
            contador++;
            suma = suma + num;
            suma2 = suma2 + (num*num);
        } while (num != 0);
        media = suma / (contador-1);
        varianza = ((float) suma2/(contador-1)) - media*media;
        System.out.println("La media es " + media + " y la varianza es " + varianza);
    }
}
