
public class PruebaSimple {

    public static void main(String[] args) {
        Despertador d1;
        d1 = new Casio(12, 34, 11, 50);

        d1.imprimirEstadoDespertador();

        d1.activarDesactivarAlarma();
        d1.imprimirEstadoDespertador();

        d1.setHora(13);
        d1.setMinutos(45);
        d1.setHoraAlarma(14);
        d1.setMinutosAlarma(20);
        d1.imprimirEstadoDespertador();

        System.out.println("Faltan " + d1.cuantoFalta() + " minutos para que suene la alarma");

    }
}
