
public interface IPublicacion {
   //METODOS MODIFICADORES
    public void setCodigo(int iCodigo);
    public void setAutor(String sAutor);
    public void setTitulo(String sTitulo);
    public void setAnioPublicacion(int iAnio);
    public void setPrestamo(boolean bPrestado);
    
    //METODOS CONSULTORES
    public int getCodigo();
    public String getAutor();
    public String getTitulo();
    public int getAnioPublicacion();
    public String getPrestamo();
    
}
