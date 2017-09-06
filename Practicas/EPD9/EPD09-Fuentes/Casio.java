public class Casio implements Despertador{
    private int hora;
    private int minutos;
    private int horaAlarma;
    private int minutosAlarma;
    private boolean alarmaActivada;
    private boolean sonando;
    
    public Casio(int h, int m, int ha, int ma){
        setHora(h);
        setMinutos(m);
        setHoraAlarma(ha);
        setMinutosAlarma(ma);
        alarmaActivada = false;
        sonando = false;
    }
    
    public Casio(){
        this(0,0,0,0);
    }
    

    public int getHora() {return hora;}
    public int getMinutos() {return minutos;}
    public int getHoraAlarma() {return horaAlarma;}
    public int getMinutosAlarma() {return minutosAlarma;}
    public boolean isAlarmaActivada() {return alarmaActivada;}
    public boolean isSonando() {return sonando;}
    
    public void setHora(int hora){
        if(hora>=0 && hora<=23)
            this.hora = hora;
        else
            System.out.println("ERROR: Hora no correcta");
        
        compruebaAlarma();
    }
    
    public void setMinutos(int minutos){
        if(minutos>=0 && minutos<=59)
            this.minutos = minutos;
        else
            System.out.println("ERROR: Minutos no correctos");
        
        compruebaAlarma();
    }

    public void setHoraAlarma(int horaAlarma) {
        if(horaAlarma>=0 && horaAlarma<=23)
            this.horaAlarma = horaAlarma;
        else
            System.out.println("ERROR: Hora de la Alarma no correcta");
        
        compruebaAlarma();
    }

    public void setMinutosAlarma(int minutosAlarma){
        if(minutosAlarma>=0 && minutosAlarma<=59)
            this.minutosAlarma = minutosAlarma;
        else
            System.out.println("ERROR: Minutos de la Alarma no correctos");

        compruebaAlarma();
        
    }
    
    public void activarDesactivarAlarma(){
        alarmaActivada = !alarmaActivada;
        compruebaAlarma();
    }
    
    public void imprimirEstadoDespertador(){
        imprimirEstadoReloj();
        System.out.println("Alarma: " + horaAlarma + ":" + minutosAlarma);
        System.out.println("¿Alarmama Activada?: " + alarmaActivada);
        if(sonando)
            System.out.println("El despertador está sonando: RRRRRIIIIIINNNNNGGGG");
        
    }
    
    public void imprimirEstadoReloj(){
        System.out.println("### ESTADO RELOJ CASIO ###:");
        System.out.println("Hora: " + hora + ":" + minutos);        
    }
    
    private void compruebaAlarma(){
        if (hora == horaAlarma && minutos == minutosAlarma && alarmaActivada)
            sonando = true;
        else
            sonando = false;
    }

    public int cuantoFalta(){
        int horaEnMinutos, alarmaEnMinutos, total;

        horaEnMinutos = hora*60+minutos;
        alarmaEnMinutos = horaAlarma*60+minutosAlarma;
        total = alarmaEnMinutos-horaEnMinutos;

        return total;
    }
    
    
}
