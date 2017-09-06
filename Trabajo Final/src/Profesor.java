
import java.util.Arrays;

public class Profesor extends Persona implements IProfesor {

    private String despacho;
    private int numAsignaturasImpartidas;
    private static final int MAXASIG = 50;
    private IAsignatura [] asignaturasImpartidas;

    public Profesor(String nombre, char sexo) {
        super(nombre, sexo);
        asignaturasImpartidas = new IAsignatura[MAXASIG];
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public void impartirAsignatura(IAsignatura asignatura) throws Exception {
        IAsignatura asig1;
        int i;
        for (i = 0; i < numAsignaturasImpartidas; i++) {
            asig1 = asignaturasImpartidas[i];
            if (asignatura.compareTo(asig1) == 0) {
                throw new Exception("La asignatura ya era impartida por el profesor " + super.getNombre()+"\n");
            }
        }
        asignaturasImpartidas[numAsignaturasImpartidas]=asignatura;
        numAsignaturasImpartidas++;
        Arrays.sort(asignaturasImpartidas, 0, numAsignaturasImpartidas);
    }

    public void eliminarAsignaturaImpartida(IAsignatura asignatura) throws Exception {
        int i, j;
        boolean encontrado=false;
        IAsignatura asig1;
        for (i = 0; i < numAsignaturasImpartidas; i++) {
            asig1 = asignaturasImpartidas[i];
            if (asignatura.compareTo(asig1) == 0) {
                for (j = i; j < numAsignaturasImpartidas-1; j++) {
                    asignaturasImpartidas[j] = asignaturasImpartidas[j + 1];
                }
                encontrado=true;
            }
        }
        if(!encontrado){
            throw new Exception("El profesor " + super.getNombre() + " no imparte " + asignatura.toString()+"\n");
        }
        numAsignaturasImpartidas--;
    }

    public IAsignatura[] getAsignaturasImpartidas() {
        return asignaturasImpartidas;
    }

    public String toString() {
        String s;
        s = super.toString() + "\tDatos del profesor\n\t\tDespacho: " + despacho
                + "\n\t\tAsignaturas Impartidas:\n\t\t\t";
        for (int i = 0; i < numAsignaturasImpartidas; i++) {
            s += asignaturasImpartidas[i].toString() + "\n\t\t\t";
        }
        return s;
    }
}
