/*Defina una clase denominada Punto con dos atributos privados de tipo double denominados x e y (las coordenadas del punto).
La clase Punto implementará los siguientes métodos:
a) Un constructor sin parámetros que defina el punto (0,0).
b) Los métodos observadores (get) y modificadores (set) estándar.
c) Un método borrar que ponga a 0 los dos atributos.
d) Un método mover que dado los dos valores pasados como parámetros cambie los atributos x e y.
e) Un método también denominado mover que cambie las coordenadas del Punto que invoca por las de un Punto pasado
como argumento.
f) Un método distancia que calcule la distancia euclídea entre el Punto que invoca y una referencia de tipo Punto que es
pasada como argumento. Utilice la función Math.sqrt() para calcular la raíz cuadrada.
g) Un método imprime por pantalla los valores de los atributos con el siguiente formato: (x , y).
Finalmente, implemente una clase principal que pruebe el funcionamiento de la clase Punto.*/
public class Punto {
    private double x,y;
    
    public Punto(){
        x=0.0;
        y=0.0;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void borrar(){
        x=0;
        y=0;
    }
    public void mover(double x, double y){
        setX(x);
        setY(y);
    }
    public void mover(Punto p){
        setX(p.getX());
        setY(p.getY());
    }
    public double distanciaEuclidea(Punto p){
        return Math.sqrt((getX()-p.getX())*(getX()-p.getX())+(getY()-p.getY())*(getY()-p.getY())); //raiz((x1-x2)^2+(y1-y2)^2)
    }
    public void imprimir(){
        System.out.println("x = " + getX() + "y = " + getY());
    }
}
