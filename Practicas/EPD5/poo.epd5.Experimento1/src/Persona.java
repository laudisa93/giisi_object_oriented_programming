
public class Persona implements IPersona {

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void presentate() {
        System.out.print("Hola, mi nombre es " + getNombre() + " y tengo " + this.edad
                + " años");
    }
}
