
public class Fijo implements ITelefono {
    int iNumero;
    boolean bAltavoz=false,bLlamada=false;
    
    
    public Fijo(int iNumero)
    {
        this.iNumero=iNumero;
    }
    public int consultarNumero() {
        return this.iNumero;
    }

   
    public void marcar(int iNum) {
        bLlamada=true;
        System.out.println(mensage()+"LLamando al número "+iNum+"...");
    }

   
    public void colgar() {
        bLlamada=false;
        System.out.println(mensage()+"Llamada finalizada.");
    }

  
    public void activarAltavoz() {
        bAltavoz=true;
        System.out.println(mensage()+"Altavoz activado, use el manos libres ahora.");
    }

   
    public void desactivarAltavoz() {
     bAltavoz=false;
        System.out.println(mensage()+"Altavoz desactivado.");
    }

   
    public void sonarTimbre() {
        System.out.println(mensage()+"Timbre Sonando....");
    }
    public String mensage()
    {
        return "FIJO CON NÚMERO "+consultarNumero()+" - ";
    }
   
    
}
