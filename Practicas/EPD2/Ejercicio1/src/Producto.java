
public class Producto {

    private static final float PRECIO_MAXIMO = 1000000; //podría ser public también

    private String nombre;
    private float precio;
    private int unidades;


    public float valorEnStock() {
        return unidades * precio;
    }

    public void incrementarStock(int incremento) {
        if(unidades + incremento >= 0)
            unidades = unidades + incremento;
        else
            System.out.println("El número de unidades no es correcto");
    }

    public void disminuirStock(int decremento) {
        if(unidades - decremento >= 0)
            unidades = unidades - decremento;
        else
            System.out.println("El número de unidades no es correcto");
    }
    //get es para recuperar los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }
    //set para cambiar los valores de esos atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidades(int unidades) {
        if(unidades >= 0)
            this.unidades = unidades;
        else
            System.out.println("El número de unidades no es correcto");
    }

    public void setPrecio(float precio) {
        if (this.precio > 0 && precio <= PRECIO_MAXIMO) {
            this.precio = precio; //El primer precio se refiere al atributo y el ultimo al parámetro
        } else {
            System.out.println("El precio no es correcto");
        }
    }
}
