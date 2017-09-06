public class Principal {

   
    public static void main(String[] args) {
        Movil oMovil = new Movil(635328353);
        Fijo oFijo = new Fijo(954692847);
        Satelite oSatelite = new Satelite(666489688);
        
        oMovil.sonarTimbre();
        oMovil.marcar(666078955);
        oMovil.activarAltavoz();
        oMovil.desactivarAltavoz();
        oMovil.colgar();
        
        oFijo.sonarTimbre();
        oFijo.marcar(666078955);
        oFijo.activarAltavoz();
        oFijo.desactivarAltavoz();
        oFijo.colgar();
        
        oSatelite.sonarTimbre();
        oSatelite.marcar(666078955);
        oSatelite.activarAltavoz();
        oSatelite.desactivarAltavoz();
        oSatelite.colgar();
    }
}
