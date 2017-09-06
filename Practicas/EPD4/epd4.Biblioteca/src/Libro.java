
public class Libro implements IPublicacion,IPrestable,IConsultable {

    private int iCodigo, iAnio;
    private String sTitulo, sAutor;
    private boolean bPrestado = false,bEstado=false;

    public Libro(int iCodigo, String sAutor, String sTitulo, int iAnio) {
        this.iCodigo = iCodigo;
        this.sAutor = sAutor;
        this.sTitulo = sTitulo;
        this.iAnio = iAnio;
        this.bPrestado = false;
    }

    public void setCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public void setAutor(String sAutor) {
        this.sAutor = sAutor;
    }

    public void setTitulo(String sTitulo) {
        this.sTitulo = sTitulo;
    }

    public void setAnioPublicacion(int iAnio) {
        this.iAnio = iAnio;
    }

    public void setPrestamo(boolean bPrestado) {
        this.bPrestado = bPrestado;
    }

    public int getCodigo() {
        return this.iCodigo;
    }

    public String getAutor() {
        return this.sAutor;
    }

    public String getTitulo() {
        return this.sTitulo;
    }

    public int getAnioPublicacion() {
        return this.iAnio;
    }

    public String getPrestamo() {
        String sPrestado;
        if (this.bPrestado == false) {
            sPrestado = "NO PRESTADO";
        } else {
            {
                sPrestado = "PRESTADO";
            }
        }
        return sPrestado;
    }

    public void prestar() {
        if(estaConsultando()==true)
        {
            System.out.println("El libro está siendo consultado por lo que no puede ser prestado aún.");
        }
        else
        {
           this.bPrestado = true; 
        }
    }

    public void devolver() {
        this.bPrestado=false;
    }

    public boolean estaPrestado() {
        return this.bPrestado;
    }
    public void retirar() {
        this.bEstado=true;
    }
    public void devolverEstado()
    {
        this.bEstado=false;
    }
    public boolean estaConsultando() {
        return this.bEstado;
    }
}
