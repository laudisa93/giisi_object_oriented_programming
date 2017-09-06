
public interface IPersona {

    public String getNombre();

    public void setNombre(String nombre);

    public String getDNI();

    public void setDNI(String DNI)throws PersonaErronea;

    public char getSexo();

    public void setSexo(char sexo)throws PersonaErronea;

    public String getDomicilio();

    public void setDomicilio(String domicilio);
}
