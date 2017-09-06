
public class ViajeroOcasional extends UsuarioMetro {

    ViajeroOcasional(int codigoViajero, String paradaInicial, String paradaFinal) {
        super(codigoViajero,paradaInicial,paradaFinal);
    }

    public void viajar() {
        System.out.println("Viajero " + codigoViajero + ": " + paradaInicial + " - " + paradaFinal + ".Ha valido su billete univiaje.");
    }

}
