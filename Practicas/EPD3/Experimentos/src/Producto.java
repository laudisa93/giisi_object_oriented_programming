
public class Producto {

    public String nombre;
    public float precio;
    public int unidades;
    private static int iva;

    public static void setIva(int iva){
        Producto.iva=iva;
    }

    public Producto(String nombre, float precio, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }

    public float valorEnStock() {
        return unidades * precio;
    }

    public void incrementarStock(int incremento) {
        unidades = unidades + incremento;
    }

    public void disminuirStock(int decremento) {
        unidades = unidades - decremento;
    }

    public void incrementarStock() {
        unidades = unidades + 1;
    }

    public void disminuirStock() {
        unidades = unidades - 1;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setPrecio(float precio) {
        if (this.precio > 0) {
            this.precio = precio;
        } else {
            this.precio = -precio;
        }
    }

    public float precioConIva() {
        return precio + calculaIva();
    }

    public float calculaIva() {
        return iva * precio / 100;
    }
}
