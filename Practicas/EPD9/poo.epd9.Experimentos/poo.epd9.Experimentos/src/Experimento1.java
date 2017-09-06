
import poo.io.IO;

public class Experimento1 {

    public static void main(String[] args) {
        int[] t = {2, 5, 7, 1, 24, 6, 12, 11, 20, 8};
        int n, suma = 0;
        System.out.println("¿Cuantos numeros quieres sumar del vector?:");
        n = (int) IO.readNumber();
        suma = calculaSuma(t, n);
        /*  try{
                for (i = 0; i < n; i++){
                suma += t[i];
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("El numero de elementos excede el tamaño del vector");
            }*/
        System.out.println("La suma es: " + suma);
    }

    public static int calculaSuma(int[] vector, int n) {
        int i, suma = 0;
        try {
            for (i = 0; i < n; i++) {
                suma += vector[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El numero de elementos excede el tamaño del vector");
            suma=0;
        }
        return suma;
    }
}
