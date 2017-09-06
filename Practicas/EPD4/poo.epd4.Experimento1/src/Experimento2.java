/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuarioupo
 */
public class Experimento2 {

    public static void main(String[] args) {
        IAeronave g = new Globo("HGB01");
        g.despegar();
        g.variarAlturaDeVuelo(300);
        g.disminuirAlturaDeVuelo(100);
        g.aterrizar();
        ((Globo)(g)).calentarAire(10);
    }
}
