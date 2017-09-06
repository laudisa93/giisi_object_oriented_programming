
import poo.io.IO;

/*
 * Escribir un programa que pida al usuario una contraseña fija establecida como
 * una constante en el programa. El programa dará 3 oportunidades al usuario
 * para averiguarla. Si el usuario averigua la contraseña se imprimirá en
 * pantalla el mensaje “Acceso permitido” y terminará el programa. Si el usuario
 * consume las tres oportunidades sin acertar la contraseña, se imprimirá en
 * pantalla “Acceso denegado” y terminará el programa.
 */
public class Problema11 {

    public static final String CONTRASENA = "2320";

    public static void main(String[] args) {
        String contrasena;
        int intentos = 3;
        System.out.println("Tiene " + intentos + " intentos. Introduzca la contraseña: ");
        contrasena = IO.readLine();
        
        while(intentos>1){
            if (contrasena.equals(CONTRASENA)) {
            System.out.println("Ha introducido la contraseña correcta.");
            } else {
                intentos--;
                System.out.println("Ha introducido la contraseña incorrecta.");
                System.out.println("Tiene " + intentos + " intentos. Introduzca la contraseña: ");
                contrasena = IO.readLine();
            }
        }
        if(intentos==1)
            System.out.println("No puede introducir la contraseña, no tiene más intentos");
    }
}
