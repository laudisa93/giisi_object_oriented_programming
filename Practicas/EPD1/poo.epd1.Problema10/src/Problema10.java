/*Escriba un programa que imprima la lista de números del uno al cien a excepción de aquellos números que sean múltiplos
 * de 2 ó de 3. */

public class Problema10 {

    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if ((i%2!=0) && (i%3!=0)){
                System.out.println(i);
            }
        }
    }
}
