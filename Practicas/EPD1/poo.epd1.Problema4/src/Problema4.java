
import poo.io.IO;

/*
 * Escriba un programa que simule el funcionamiento de un termostato. Para ello,
 * se le pedirá al usuario la temperatura actual, y la temperatura deseada por
 * debajo de la cual se activará la calefacción (se muestra un mensaje por
 * pantalla pidiendo su activación) y por encima de la cual se activará el aire
 * acondicionado frío (un mensaje por pantalla similar al caso anterior). Si la
 * temperatura actual coincide con la temperatura se indicará un mensaje por
 * pantalla advirtiendo de ello.
 */
public class Problema4 {

    public static void main(String[] args) {
        double tempAct, tempCal, tempAirCon;
        System.out.println("Introduzca la temperatura actual: ");
        tempAct = IO.readNumber();
        System.out.println("Introduzca la temperatura a la que desee activar la calefación: ");
        tempCal = IO.readNumber();
        System.out.println("Introduzca la temperatura a la que desee activar el aire acondicionado: ");
        tempAirCon = IO.readNumber();
        if (tempAct < tempCal) {
            System.out.println("¿Activar la calefación?");
        } else if (tempAct > tempAirCon) {
            System.out.println("¿Activar el aire acondicionado?");
        } else if ((tempAct == tempCal) || (tempAct == tempAirCon)) {
            System.out.println("La temperatura actual es igual a la temperatura");
        }
    }
}
