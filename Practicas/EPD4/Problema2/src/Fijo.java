
public class Fijo implements ITelefono{
    
    private int numero;
    
    public Fijo(int numero){
        this.numero = numero;       
    }
    public void consultarNumero() {
        System.out.println("Se está consultando el número de fijo...");
    }

    public void marcar(int n) {
        System.out.println("Marcando el número de fijo..." + n);
    }

    public void colgar() {
        System.out.println("Colgando al número de fijo...");
    }

    public void activarAltavoz() {
        System.out.println("Activando altavoz del número de fijo...");
    }

    public void desactivarAltavoz() {
        System.out.println("Desactivando altavoz del número de fijo...");
    }

    public void sonarTimbre() {
            System.out.println("Sonando tiembre del número de fijo...");
    }
}