
public class PruebaEPDFinal {

    private static void mostrar(Object o) {
        System.out.println(o.toString() + "\n");
    }

    public static void main(String args[]) {
        System.out.println("****************** PRUEBA EPD FINAL ******************\n");
        System.out.println("## PRUEBA ASIGNATURAS ##\n");
        IAsignatura poo = new Asignatura("49001", "Programacion Orientada a Objetos", "POO", 1, 2, 6);
        IAsignatura fc = new Asignatura("49005", "Fundamentos de Programación", "FC", 1, 1, 6);
        IAsignatura est = new Asignatura("49007", "Estadística", "EST", 1, 2, 6);
        IAsignatura bio = new Asignatura("49025", "Bioinformática", "BIO", 4, 2, 6);
        IAsignatura so = new Asignatura("490009", "Sistemas Operativos", "SO", 2, 2, 6);
        mostrar(poo);
        mostrar(fc);
        mostrar(est);
        mostrar(bio);
        mostrar(so);
        System.out.println("## PRUEBA ALUMNOS ##\n");
        IAlumno a1 = new Alumno("Antonio Ruiz", 'm', "Grado IISI", 2);
        IAlumno a2 = new Alumno("Maria Navarro", 'f', "Grado IISI", 3);
        IAlumno a3 = new Alumno("Roberto Pontes", 'm', "Conjunta IISI-Teleco", 1);
        try{
        a1.setDNI("12345678P");
        a1.setDomicilio("Sevilla");
        a2.setDNI("36984215L");
        a2.setDomicilio("Dos Hermanas (Sevilla)");
        a3.setDNI("23147058U");
        a3.setDomicilio("Huelva");
        }catch(PersonaErronea p){
            System.out.println("Error: " + p.getMessage());
        }
        try{
            a1.cursarAsignatura(poo);
            a1.cursarAsignatura(so);
            a2.cursarAsignatura(fc);
            a2.cursarAsignatura(poo);
            a3.cursarAsignatura(est);
            a3.cursarAsignatura(bio);
            a3.cursarAsignatura(poo);
            a1.cursarAsignatura(poo); // ESTO DEBE PROVOCAR UN ERROR AL ESTAR REPETIDA
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        mostrar(a1);
        mostrar(a2);
        mostrar(a3);
        try{
            a3.eliminarAsignaturaCursada(poo);            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        mostrar(a3);
        try{
            a3.eliminarAsignaturaCursada(fc); // ESTO DEBE PROVOCAR UN ERROR, EL ALUMNO NO LA CURSA    
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("## PRUEBA PROFESORES ##\n");
        IProfesor p1 = new Profesor("Antonio Carrasco", 'm');
        IProfesor p2;
        try{
            p1.setDNI("23607842J");
            p1.setDNI("2360782J"); // ESTO DEBE PROVOCAR UN ERROR
            p1.setDespacho("11.1.1");
            p1.setDomicilio("c/Feria, 25, Sevilla");
            p1.setSexo('v'); // ESTO DEBE PROVOCAR UN ERROR
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }          
        p2 = new Profesor("Miguel Blanco", 'm');
        try{
            p2.setDNI("47852361M");
            p2.setDespacho("11.2.2.");
            p2.setDomicilio("c/ La Pepa, 33, Cádiz");
        }catch(PersonaErronea p){
            System.out.println("Error: " + p.getMessage());
        }
        
        try{
            p1.impartirAsignatura(poo);
            p1.impartirAsignatura(fc);
            p2.impartirAsignatura(so);
            p2.impartirAsignatura(bio);
            p1.impartirAsignatura(poo); // ESTO DEBE PROVOCAR UN ERROR AL ESTAR REPETIDA
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        mostrar(p1);
        mostrar(p2);
        try{
            p2.eliminarAsignaturaImpartida(bio);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        mostrar(p2);
        try{
            p2.eliminarAsignaturaImpartida(est);//ESTO DEBE PROVOCAR UN ERROR, EL PROFE NO LA IMPARTE
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}