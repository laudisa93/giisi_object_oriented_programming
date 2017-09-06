
public interface IProfesor extends IPersona {

    public String getDespacho();

    public void setDespacho(String despacho);

    public void impartirAsignatura(IAsignatura asignatura) throws Exception;

    public void eliminarAsignaturaImpartida(IAsignatura asignatura) throws Exception;
    
    public IAsignatura [] getAsignaturasImpartidas();
}
