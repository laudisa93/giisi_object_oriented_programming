
import poo.io.IO;

/*Escriba un programa que permita al usuario jugar a adivinar un número del 1 al 100. El programa
generará un número aleatorio, y pedirá al usuario que lo adivine. Si el usuario adivina dicho
número se le felicitará y terminará el programa. En caso contrario, se le indicará al usuario
si el número que ha de adivinar es mayor o menor que el número que el usuario ha indicado, y se
le volverá a dar de nuevo la oportunidad de que lo adivine.*/
public class Ejercicio4 {

    public static void main(String[] args) {
        int n, x;
        n = new java.util.Random().nextInt(100) + 1;
        System.out.println("Adivine un número del 1 al 100\n");
        System.out.println("Introduzca un número: \n");
        x = (int) IO.readNumber();
        while (x != n) {
            if (x < n) {
                System.out.println("El número que se busca es mayor\n");

            } else {
                System.out.println("El número que se busca es menor\n");
            }
            System.out.println("Introduzca un nuevo número: \n");
            x = (int) IO.readNumber();
        }
        System.out.println("\n¡Felicidades! Ha encontrado el número.");
    }
}
