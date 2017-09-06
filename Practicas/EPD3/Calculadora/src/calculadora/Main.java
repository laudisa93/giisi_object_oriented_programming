/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author usuarioupo
 */
public class Main {
public static void main(String [] args){
    double a;
    a  = Calculadora.sumar(7.5, 2.5);
    a  = Calculadora.potencia(a, 3);

    Calculadora.setMemoria (a);
    a  = Calculadora.restar(11.3, 6.3);
    a  = Calculadora.multiplicar(a, 100);
    a  = Calculadora.sumar(Calculadora.getMemoria(), a);

    System.out.println ("El resultado de la operacion es " + a);
}

}

