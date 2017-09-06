
public class Hijo extends Padre {

    public Hijo() {
        System.out.println("Se ha llamado al constructor por defecto de la "
                + "clase Hijo");
    }

    public Hijo(int n) {
        super (n);
        System.out.println("Se ha llamado al constructor con un argumento "
                + "int n=" + n + " de la clase Hijo");
    }
}
