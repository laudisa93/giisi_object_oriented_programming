
public interface Motocicleta {

    public boolean isDiesel();

    public void setDiesel(boolean diesel);

    public String getMatricula();

    public void setMatricula(String matricula);

    public String getModelo();

    public void setModelo(String modelo);

    public Propietario getTitular();

    public void setTitular(Propietario titular);

    public int getLitrosCarburante();

    public void setLitrosCarburante(int litrosCarburante);

    public int getCapacidadDeposito();

    public void setCapacidadDeposito(int capacidadDeposito);

    public int repostar();

    public int repostar(double porcentaje);

    public int repartirCombustible(Motocicleta motocicleta1, Motocicleta motocicleta2);

}
