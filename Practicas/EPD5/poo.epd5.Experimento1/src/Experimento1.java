
public class Experimento1 {

    public static void main(String[] args) {
        IPersona p = new Persona();
        IBebe b = new Bebe();
        p.setNombre("Juan");
        p.setEdad(23);
        b.setNombre("Antoñito");
        b.setEdad(1.5);
        p.presentate();
        System.out.println("");
        b.presentate();
        System.out.println("");
    }
}
