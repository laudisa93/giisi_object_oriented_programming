
import MatematicaSimple.Calculadora;
import MatematicaCompleja.OperacionesComplejas;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dNum1 = 10;
        int dNum2 = 5;      
        System.out.println("El resultado de multiplicar " + dNum1 + " x " + dNum2 + " es " + Calculadora.multiplicar(dNum1, dNum2));
        System.out.println("El inverso de "+dNum2+" es "+OperacionesComplejas.inverso(5));
    }
}
