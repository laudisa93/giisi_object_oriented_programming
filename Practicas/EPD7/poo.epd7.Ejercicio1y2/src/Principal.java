
import poo.io.*;

public class Principal {

    public static void main(String[] args) {
        int INTENTOS = 3;
        String cad = "prueba";
        String cad2;
        System.out.println("Introduzca la contraseña: ");
        cad2 = IO.readLine();
        while (!cad.equalsIgnoreCase(cad2) && INTENTOS > 0) {
            cad2 = IO.readLine();

            if (cad.equalsIgnoreCase(cad2)) {
                System.out.println("La contraseña ha sido aceptada");
            } else {
                INTENTOS--;
                System.out.println("La contraseña no ha sido aceptada");
                System.out.println("Tiene " + INTENTOS + " intentos.");
                System.out.println("Introduzca la contraseña: ");
            }



            
        }
    }
}
