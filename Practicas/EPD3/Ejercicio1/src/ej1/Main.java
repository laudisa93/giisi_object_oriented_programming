/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ej1;


public class Main {
public static void main(String [] args){

        Semaforo s = new Semaforo();
        Semaforo s1 = new Semaforo(1);
        s.imprimir();

        s.setColor(3);
        s.imprimir();

        s.setColor(2);
        s.imprimir();

        s.setParpadeando(true);
        s.imprimir();

        for(int i=0;i<10;i++){
            s.cambio();
            s.imprimir();
        }

    }

}


}
}
