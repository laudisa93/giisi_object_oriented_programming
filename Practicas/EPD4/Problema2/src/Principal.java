
public class Principal {
    public static void main(String[] args){
        Movil m = new Movil (671437602);
        Fijo f = new Fijo (954409037);
        Satelite s = new Satelite (660881481);
        
        m.marcar(954409037);
        m.activarAltavoz();
        m.desactivarAltavoz();
        
        f.sonarTimbre();
        f.colgar();
        
        s.marcar(667689837);
        s.sonarTimbre();
        s.colgar();
    }
}
