
import poo.io.IO;

public class Vehiculo implements Automovil, Motocicleta {

    private String matricula;
    private String modelo;
    Propietario titular = new Propietario(modelo, modelo, modelo);
    private boolean diesel;
    private int litrosCarburante;
    private int capacidadDeposito;


    public Vehiculo(String matricula, String modelo, boolean diesel, int litrosCarburante, int capacidadDeposito) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.diesel = diesel;
        this.litrosCarburante = litrosCarburante;
        this.capacidadDeposito = capacidadDeposito;
    }

    public Vehiculo(String matricula, String modelo, boolean diesel, int litrosCarburante, int capacidadDeposito, String dni, String apellidos, String nombre) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.diesel = diesel;
        this.litrosCarburante = litrosCarburante;
        this.capacidadDeposito = capacidadDeposito;
        titular.getDni();
        titular.getApellidos();
        titular.getNombre();
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getTitular() {
        return titular;
    }

    public void setTitular(Propietario titular) {
        this.titular = titular;
    }

    public int getLitrosCarburante() {
        return litrosCarburante;
    }

    public void setLitrosCarburante(int litrosCarburante) {
        this.litrosCarburante = litrosCarburante;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public int repostar() {
        litrosCarburante = capacidadDeposito;
        return capacidadDeposito - litrosCarburante;
    }

    public int repostar(double porcentaje) {
        int resul;
        double porcentajeActual;
        porcentajeActual = (litrosCarburante * 100) / capacidadDeposito;
        if (((porcentaje * capacidadDeposito) <= capacidadDeposito) && (porcentaje >= porcentajeActual)) {
            litrosCarburante = (int) porcentaje * capacidadDeposito;
            resul = (int) (porcentaje * capacidadDeposito) - this.litrosCarburante;
            System.out.println("El vehiculo tenía " + litrosCarburante + "litros (" + porcentajeActual + ") y ahora tiene " + resul + " litros (" + porcentaje + ").");
        } else if ((porcentaje * capacidadDeposito) > capacidadDeposito) {
            System.out.println("El porcentaje para repostar no puede ser mayor que el 100%.");
        } else {
            System.out.println("No se ha repostado combustible porque se ha pedido repostar al " + porcentaje + "% y el depósito está al " + porcentajeActual + "%.");
        }
        return (int) (porcentaje * capacidadDeposito) - this.litrosCarburante;
    }

    public int transferirCombustible(Automovil automovil) {
        int x=0;
        int autoLitrosDesp;
        int litrosCarburanteDesp;
        if (diesel == automovil.isDiesel()) {
            System.out.println("¿Cuánto combustible desea transferir?: ");
            x = (int) IO.readNumber();
            while ((x > automovil.getLitrosCarburante()) || ((x + litrosCarburante) > capacidadDeposito)) {
                if((x + litrosCarburante) > capacidadDeposito){
                     System.out.println("No cabe tanto combustible en este automovil.");
                }
                else {
                     System.out.println("El automovil no puede transferir dicha cantidad de combustible.");
                }
                System.out.println("¿Cuánto combustible desea transferir?: ");
                x = (int) IO.readNumber();
            }
            autoLitrosDesp = automovil.getLitrosCarburante() - x;
            litrosCarburanteDesp = litrosCarburante + x;
            System.out.println("Se han transferido " + x + "litros. Ahora el automovil receptor tiene " + litrosCarburanteDesp + " litros y el donante se queda con " + autoLitrosDesp + " litros.");
        } else {
            System.out.println("No se puede transferir combustible del automovil porque no es del mismo tipo.");
        }
        return litrosCarburante + x;
    }

    public int repartirCombustible(Motocicleta motocicleta1, Motocicleta motocicleta2) {
        int suma, reparto;
        suma = motocicleta1.getLitrosCarburante()+motocicleta2.getLitrosCarburante()+litrosCarburante;
        reparto=suma/3;
        if((reparto<=motocicleta1.getCapacidadDeposito())&&(reparto<=motocicleta2.getCapacidadDeposito())&&(reparto<=litrosCarburante)){
            motocicleta1.setLitrosCarburante(reparto);
            motocicleta2.setLitrosCarburante(reparto);
            litrosCarburante=reparto;
            System.out.println("Se han repartido "+ reparto + " litros a partes iguales.");
        }else{
            System.out.println("No se puede hacer un reparto igualitario entre estas tres motocicletas debido a la insuficiente capacidad de sus depósitos.");
        }
        return reparto;
    }
}
