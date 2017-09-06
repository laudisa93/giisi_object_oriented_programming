
public class Positivo {

    private int numero;

    public Positivo(int numero) throws Exception {
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws Exception {
        if (numero >= 0) {
            this.numero = numero;
        } else {
            throw new Exception("ERROR: EL número debe ser positivo");
        }
    }

    public void divide(Positivo p) throws Exception{
        if(p.numero!=0){
            numero = numero / p.numero;
        }else{
            throw new Exception("ERROR: EL denominador no puede ser cero");
        }
    }
}
