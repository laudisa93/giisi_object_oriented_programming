
import poo.io.IO;

/*Escriba un programa que dada una variable real f que representa una temperatura en grados Fahrenheit, almacene en otra
variable real c la misma temperatura en grados Celsius e imprima el resultado por pantalla. Utilice la siguiente fórmula:
a) Pruebe el funcionamiento del programa sabiendo que 75 grados Fahrenheit equivalen a 23.8 grados Celsius.
b) La fórmula de transformación puede ser representada por diversas expresiones. Vuelva a ejecutar el programa pero
usando las siguientes expresiones. ¿Cuáles de ellas son correctas y cuáles no lo son? Justifique su respuesta.
1. c = 5/9*(f-32);
2. c = (5/9)*(f-32);
3. c = (5/9.0)*(f-32);
4. c = ((double)5/9)*(f-32);
5. c = (f-32)*5/9;*/
public class Ejercicio5 {
    public static void main (String[] args){
        int f;
        double c;
        System.out.println("Escriba la temperatura en grados Fahrenheit: ");
        f = (int) IO.readNumber();
        c = (5/9.0)*(f-32);
        System.out.println(f + "º Fahrenheit = " + c + "º Celsius");
    }        
}
