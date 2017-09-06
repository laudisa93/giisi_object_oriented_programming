//Escriba un programa que calcule la suma de todos los números del 1 al 100.

public class Ejercicio2 {
    public static void main(String[] args) {
        int x=1,suma=0;
        for(x=1;x<=100;x++){
            suma=suma+x;
        }
        System.out.println("La suma de todos los números del 1 al 100 es: " + suma);
    }
}