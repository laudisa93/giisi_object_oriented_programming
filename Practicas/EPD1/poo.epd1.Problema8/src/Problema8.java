
import poo.io.IO;

/* Escriba un programa que indique si el año introducido por un usuario es o no bisiesto. Los años bisiestos 
son múltiplos de cuatro, sin embargo, los múltiplos de 100 sólo son bisiestos cuando a la vez son múltiplos 
de 400 (por ejemplo 1800 no es bisiesto, mientras que 2000 si lo es).*/

public class Problema8 {
    public static void main (String[] args){
        int año,esBisiesto=0;
        System.out.println("Introduzca un año: ");
        año = (int) IO.readNumber();
        if(año%4==0){
            if((año%100==0) && (año%400==0)){
                esBisiesto=1;
            }
        }
        if(esBisiesto==0){
            System.out.println("El año " + año + " no es bisiesto");
        }else{
            System.out.println("El año " + año + " es bisiesto");
        }
    }
}
