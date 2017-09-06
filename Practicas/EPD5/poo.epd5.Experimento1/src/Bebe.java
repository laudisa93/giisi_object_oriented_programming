
public class Bebe extends Persona implements IBebe {

    private double edad;

    public void setEdad(double edad) {
        this.edad = edad;
    }

    /*E1
     public void presentate() {
        System.out.print("Hola, mi nombre es " + getNombre() + " y tengo " + edad
                + " años");
    }*/

    public void presentate() {
        super.presentate(); //el super llama a un método de la clase padre
        System.out.print(" y " + ((this.edad - getEdad()) * 12) + " meses");
    }
}
