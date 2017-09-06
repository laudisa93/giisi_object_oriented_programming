import poo.io.IO;
import java.lang.*;
/*
 * Escriba un programa similar al anterior, pero que calcule el área y el
 * perímetro de un cuadrado (conociendo el lado) y un triángulo recto
 * (conociendo su base y altura).
 */
public class Problema3 {

    public static final double PI = 3.14; //Constante PI

    public static void main(String[] args) {
        int lado, base, altura;
        double area, perimetro, hipotenusa;
        System.out.println("Introduzca el lado del cuadrado: ");
        lado = (int) IO.readNumber();
        area = lado * lado;
        perimetro = lado * 4;
        System.out.println("El área es " + area + "m y el perímetro es " + perimetro + "m\n");
        System.out.println("Introduzca la base del triángulo recto: ");
        base = (int) IO.readNumber();
        System.out.println("Introduzca la altura del triángulo recto: ");
        altura = (int) IO.readNumber();
        area = ((double) base * altura) / 2;
        hipotenusa = Math.sqrt(base * base + altura * altura);
        perimetro = base + altura + hipotenusa;
        System.out.println("El área es " + area + "m y el perímetro es " + perimetro + "m\n");
    }
}