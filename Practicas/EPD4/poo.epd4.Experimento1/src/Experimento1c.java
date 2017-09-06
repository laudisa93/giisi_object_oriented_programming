
public class Experimento1c {

    public static void main(String[] args) {
        IAeronave a = new Airbus340("XW432", 200);
        IAvion av = new Airbus340("XA123", 225);
        a.despegar();
        a.aterrizar();
        av.abrirTrenDeAterrizaje();
        ((IAeronave)(av)).despegar();
        ((IAeronave)(av)).aterrizar();
        av.cerrarTrenDeAterrizaje();
    }
}
