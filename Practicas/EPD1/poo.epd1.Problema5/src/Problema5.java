
import poo.io.IO;

/*
 * Escriba un programa que pida al usuario el día, mes (en formato numérico) y
 * año, y le muestre por pantalla dicha fecha indicando el mes por su nombre
 * (por ejemplo, si se indica día 1, mes 3 y año 2011, el programa tiene que
 * devolver el resultado “1 de Marzo de 2011”).
 */
public class Problema5 {

    public static void main(String[] args) {
        int dia, mes, año;
        System.out.println("Introduzca su día de nacimiento: ");
        dia = (int) IO.readNumber();
        System.out.println("Introduzca su mes de nacimiento: ");
        mes = (int) IO.readNumber();
        System.out.println("Introduzca su año de nacimiento: ");
        año = (int) IO.readNumber();
        switch (mes) {
            case 1:
                System.out.println(dia + " de enero de " + año);
                break;
            case 2:
                System.out.println(dia + " de febrero de " + año);
                break;
            case 3:
                System.out.println(dia + " de marzo de " + año);
                break;
            case 4:
                System.out.println(dia + " de abril de " + año);
                break;
            case 5:
                System.out.println(dia + " de mayo de " + año);
                break;
            case 6:
                System.out.println(dia + " de junio de " + año);
                break;
            case 7:
                System.out.println(dia + " de julio de " + año);
                break;
            case 8:
                System.out.println(dia + " de agosto de " + año);
                break;
            case 9:
                System.out.println(dia + " de septiembre de " + año);
                break;
            case 10:
                System.out.println(dia + " de octubre de " + año);
                break;
            case 11:
                System.out.println(dia + " de noviembre de " + año);
                break;
            case 12:
                System.out.println(dia + " de diciembre de " + año);
                break;
        }
    }
}
