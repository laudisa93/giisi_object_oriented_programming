
public class Experimento5 {

    public static void main(String[] args) {
        double a;
        a = Calculadora.sumar(7.5, 2.5);
        a = Calculadora.potencia(a, 3);
        Calculadora.setMemoria(a);
        a = Calculadora.restar(11.3, 6.3);
        a = Calculadora.multiplicar(a, 100);
        a = Calculadora.sumar(Calculadora.getMemoria(), a);
        System.out.println("El resultado de la operacion es " + a);
    }
}
