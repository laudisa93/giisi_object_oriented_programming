/*Escriba un programa que pida al usuario dos números enteros. Una vez obtenidos los dos números, el 
programa mostrará al usuario una serie de opciones numeradas (un menú), y esperará que el usuario teclee
la opción deseada. Entre las opciones del menú se le deberán ofrecer al usuario las siguientes:
1. Sumar los números.
2. Restar los números.
3. Multiplicar los números.
4. Dividir los números.
Una vez que el usuario haya escogido la opción, se realizará la operación con los números asociada a dicha
opción y se ofrecerá el resultado de dicha operación por pantalla. En el caso de que el usuario seleccione
una opción que no aparece en el menú se le indicará que la opción es incorrecta, y se volverá a mostrar
el menú para que el usuario seleccione de nuevo una operación.*/
import poo.io.IO;

public class Problema1 {
    public static void main (String[] args){
           int x, y, opcion;
           double resultado;
           System.out.println("Escriba un número x: ");
           x = (int) IO.readNumber();
           System.out.println("Escriba un número y: ");
           y = (int) IO.readNumber();
           
           do{
                //Menu:
                System.out.println("MENU:\n");
                System.out.println("1. Sumar los números.\n");
                System.out.println("2. Restar los números.\n");
                System.out.println("3. Multiplicar los números.\n");
                System.out.println("4. Dividir los números.\n");
                System.out.println("0. Salir del menú.\n");
                System.out.println("Escoja una opcion: \n");
                opcion = (int) IO.readNumber();
                while ((opcion>4) ||(opcion<0)){
                    System.out.println("Escoja una opción válida.\n");
                    opcion = (int) IO.readNumber();
                }
                switch(opcion){
                    case 1:
                        resultado = x + y;
                        System.out.println("El resultado de la suma es \n" + resultado);
                        break;
                    case 2:
                        resultado = x - y;
                        System.out.println("El resultado de la resta es \n" + resultado);
                        break;
                    case 3:
                        resultado = x * y;
                        System.out.println("El resultado de la multiplicación es \n" + resultado);
                        break;
                    case 4:
                        resultado = x / y;
                        System.out.println("El resultado de la división es \n" + resultado);
                        break;
                }
           }while(opcion!=0);
    }
}
