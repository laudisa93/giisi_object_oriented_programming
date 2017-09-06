
import poo.io.*;

public class Experimento3 {

    public static void main(String[] args) {
        int digito;
        do {
            System.out.println("Introduzca un dígito (0-9):");
            digito = (int) IO.readNumber();
            if ((digito < 0) || (digito > 9)) {
                System.out.println("Error, no has introducido un digito");
            }
        } while ((digito < 0) || (digito > 9));
        System.out.println("¡Gracias! Has introducido el numero " + digito);
    }
}
