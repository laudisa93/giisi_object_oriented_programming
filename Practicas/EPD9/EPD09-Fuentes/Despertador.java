public interface Despertador extends Reloj{
    public int getHoraAlarma();
    public int getMinutosAlarma();
    public void setHoraAlarma(int h);
    public void setMinutosAlarma(int m);
    public boolean isAlarmaActivada();
    public boolean isSonando();
    
    public void activarDesactivarAlarma();
    
    public void imprimirEstadoDespertador();

    public int cuantoFalta();
}
