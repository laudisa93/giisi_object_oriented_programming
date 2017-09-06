
public class ViajeroAbonado extends UsuarioMetro {

    ViajeroAbonado(int codigoViajero, String paradaInicial, String paradaFinal) {
        super(codigoViajero,paradaInicial,paradaFinal);
    }
    public void viajar() {
           System.out.println("Viajero " + codigoViajero + ": " + paradaInicial + " - " + paradaFinal + ".");

    }

}
