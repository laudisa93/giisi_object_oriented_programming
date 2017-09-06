
public class Experimento2 {

    public static void main(String[] args) {
        IProfesor p1 = new Profesor("Carlos", "García Ramos", "28.987.654-Z", 31);
        IPersona p2 = new Profesor("Manuel", "Vázquez López", "16.085.624-A", 29);
        ITrabajador p3 = new Profesor("Rosa", "Martos Rodríguez", "75.731.756-R", 27);
        p1.setSueldo(1500);
        p1.setAntiguedad(1);
        p1.setUniversidad("Universidad Pablo de Olavide");
        p1.setNumeroAlumnos(150);
        p1.setFuncionario(false);
        ((ITrabajador)p2).setSueldo(1400);
        ((ITrabajador)p2).setAntiguedad(0);
        ((IProfesor)p2).setUniversidad("Universidad Internacional de Andalucía");
        ((IProfesor)p2).setNumeroAlumnos(350);
        ((IProfesor)p2).setFuncionario(false);
        p3.setSueldo(1800);
        p3.setAntiguedad(3);
        ((IProfesor)p3).setUniversidad("Universidad de Cádiz");
        ((IProfesor)p3).setNumeroAlumnos(220);
        ((IProfesor)p3).setFuncionario(false);
        p2.cumpleAnios();
        p1.subirSueldo(20);
        ((IProfesor)p3).aprobarOposiciones();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
