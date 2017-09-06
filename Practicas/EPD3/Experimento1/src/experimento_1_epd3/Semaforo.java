
package experimento_1_epd3;


public class Semaforo {
    private int color;
    private boolean parpadeando;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        if(color == 0 || color==2){
            this.color = color;
            parpadeando = false;
        }
        else if(color == 1)
            this.color = color;
    }

    public boolean isParpadeando() {
        return parpadeando;
    }

    public void setParpadeando(boolean parpadeando) {
        if(parpadeando == false || (parpadeando == true && color == 1)) //asegura que el color es AMBAR
                this.parpadeando = parpadeando;
    }

    public String cadenaColor(){
        String s = null;
        switch(color){
            case 0: s = "ROJO"; break;
            case 1: s = "ÁMBAR"; break;
            case 2: s = "VERDE"; break;
        }
        return s;
    }

    public void imprimir(){
        if (parpadeando)
            System.out.println("Semáforo en " + cadenaColor() + " parpadeando.");
        else
            System.out.println("Semáforo en " + cadenaColor());
    }

    public void cambio(){
         switch(color){
            case 0:
                setColor(2);
                break;
            case 1:
                if(parpadeando)
                    setParpadeando(false);
                else
                    setColor(0);
                break;
            case 2:
                setColor(1);
                setParpadeando(true);
                break;
        }
    }


}