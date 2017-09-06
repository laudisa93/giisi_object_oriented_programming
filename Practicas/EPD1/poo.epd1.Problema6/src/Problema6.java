
import poo.io.IO;

/*
 * Elija un número como clave de seguridad. Escriba un programa que pida al
 * usuario que introduzca la clave. Si el usuario introduce la clave
 * correctamente el programa informará a éste por pantalla y terminará. Si no,
 * se pedirá de nuevo la clave hasta que el usuario acierte.
 */
public class Problema6 {

    public static final int CLAVE = 2320;

    public static void main(String[] args) {
        int contraseña,encontrado=0;
        
        do {
            System.out.println("Introduzca la clave: ");
            contraseña = (int) IO.readNumber();

            if (contraseña == CLAVE) {
                System.out.println("Ha introducido correctamente la clave.");
                encontrado = 1;
            } else {
                System.out.println("Ha introducido incorrectamente la clave.");
            }
        }while (encontrado==0);  
    }
}
