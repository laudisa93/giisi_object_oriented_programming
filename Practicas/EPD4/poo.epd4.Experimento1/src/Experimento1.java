
public class Experimento1 {

    public static void main(String[] args) {
        IAeronave a = new Airbus340("XW432", 200);
        a.despegar();
        a.aterrizar();
    }
}
