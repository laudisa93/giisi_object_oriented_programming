
import java.util.Arrays;


public class Alumno extends Persona implements IAlumno {

    private String titulacion;
    private int cursoMatriculado;
    private int numAsignaturasCursadas;
    private static final int MAXASIG = 100;
    private IAsignatura [] asignaturasCursadas;

    public Alumno(String nombre, char sexo, String titulacion, int cursoMatriculado) {
        super(nombre, sexo);
        this.titulacion = titulacion;
        this.cursoMatriculado = cursoMatriculado;
        asignaturasCursadas= new IAsignatura[MAXASIG];
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setCursoMatriculado(int cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public IAsignatura[] getAsignaturasCursadas() {
        return asignaturasCursadas;
    }

    public void cursarAsignatura(IAsignatura asignatura) throws Exception {
        IAsignatura asig1;
        int i;
        ComparadorAsignatura comparador = new ComparadorAsignatura();
        for(i=0;i<numAsignaturasCursadas;i++){
            asig1=asignaturasCursadas[i];
            if(comparador.compare(asignatura, asig1)==0){
                throw new Exception ("La asignatura ya era cursada por el alumno " + super.getNombre()+"\n");
            } 
        }
        asignaturasCursadas[numAsignaturasCursadas]=asignatura;
        numAsignaturasCursadas++;//java api 6 arrays
        Arrays.sort(asignaturasCursadas,0,numAsignaturasCursadas,new ComparadorAsignatura());   
    }


    public void eliminarAsignaturaCursada(IAsignatura asignatura) throws Exception {
        int i,j;
        boolean encontrado=false;
        ComparadorAsignatura comparador = new ComparadorAsignatura();
        IAsignatura asig1;
        for (i=0;i<numAsignaturasCursadas;i++) {
            asig1=asignaturasCursadas[i];
            if(comparador.compare(asignatura,asig1)==0){
                for(j=i;j<numAsignaturasCursadas-1;j++){
                    asignaturasCursadas[j]=asignaturasCursadas[j+1];
                }
                encontrado=true;
            }
        }if(!encontrado){
                throw new Exception ("El alumno "+ super.getNombre() +" no esta matriculado en " 
                        + asignatura.toString()+"\n");
            }
        numAsignaturasCursadas--;
    }

    public String toString() {
        String s;
        s = super.toString() + "\tDatos del alumno\n\t\tTitulación: " + titulacion + "\n\t\tCursoMatriculado: " 
                + cursoMatriculado + "\n\t\tAsignaturas:\n\t\t\t";
        for (int i = 0; i < numAsignaturasCursadas; i++) {
            s = s + asignaturasCursadas[i].toString() + "\n\t\t\t";
        }
        return s;
    }
}
