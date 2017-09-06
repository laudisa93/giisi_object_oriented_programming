
public interface IProfesor extends IPersona, ITrabajador {

    public String getUniversidad();

    public void setUniversidad(String Universidad);

    public int getNumeroAlumnos();

    public void setNumeroAlumnos(int numeroAlumnos);

    public boolean isFuncionario();

    public void setFuncionario(boolean funcionario);

    public void aprobarOposiciones();
}
