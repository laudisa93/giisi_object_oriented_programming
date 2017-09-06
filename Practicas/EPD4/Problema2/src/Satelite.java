
public class Satelite implements ITelefono{
    
    private int numero;
    
    public Satelite(int numero){
        this.numero = numero;       
    }
    public void consultarNumero() {
        System.out.println("Se está consultando el número de satélite...");
    }

    public void marcar(int n) {
        System.out.println("Marcando el número de satélite..." + n);
    }

    public void colgar() {
        System.out.println("Colgando al número de satélite...");
    }

    public void activarAltavoz() {
        System.out.println("Activando altavoz del número de satélite...");
    }

    public void desactivarAltavoz() {
        System.out.println("Desactivando altavoz del número de satélite...");
    }

    public void sonarTimbre() {
        System.out.println("Sonando tiembre del número de satélite...");
    }
}
