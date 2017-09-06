
public class Ejercicio3 {
    private static String reemplazar (String cadena){
        String res;

        res = cadena.replaceAll("es","no por");
        res = res.replaceAll("[0-9]+", "*");
        return res;
    }
    public static void main (String[] args){
        String cad= "esto1234es5678bueno900";

        System.out.println("Cadena antes: " + cad);
        System.out.println("Cadena después: " + reemplazar(cad));
    }
}
