
public interface IAlumno extends IPersona {

    public String getTitulacion();

    public int getCursoMatriculado();

    public void setTitulacion(String titulacion);

    public void setCursoMatriculado(int cursoMatriculado);

    public IAsignatura[] getAsignaturasCursadas();

    public void cursarAsignatura(IAsignatura asignatura) throws Exception;

    public void eliminarAsignaturaCursada(IAsignatura asignatura) throws Exception;
}
