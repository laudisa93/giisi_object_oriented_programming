/*Complete el siguiente programa que dado el radio de un círculo (de tipo double), calcule el diámetro, 
 el área y la longitud de la circunferencia, y que muestre por pantalla dichos valores. Compílelo y ejecútelo.*/

public class Problema2 {

    public static final double PI = 3.14; //Constante PI
    public static void main(String[] args) {
        double radio = 4;
        double diametro, area, circunferencia;
        diametro = 2 * radio;
        area = PI * PI * radio;
        circunferencia = PI * diametro;
        System.out.println("El diámetro es " + diametro + ", el área es " + area + " y la longitud es " + circunferencia);
    }
}