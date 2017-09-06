
public class Movil implements ITelefono{
    
    private int numero;
    
    public Movil(int numero){
        this.numero = numero;       
    }

    public void consultarNumero() {
        System.out.println("Se está consultando el número de móvil...");
    }
    public void marcar(int n) {
        System.out.println("Marcando el número de móvil..." + n);
    }

    public void colgar() {
        System.out.println("Colgando al número de móvil...");
    }

    public void activarAltavoz() {
        System.out.println("Activando altavoz del número de móvil...");
    }

    public void desactivarAltavoz() {
        System.out.println("Desactivando altavoz del número de móvil...");
    }

    public void sonarTimbre() {
        System.out.println("Sonando tiembre del número de móvil...");
    }
}

