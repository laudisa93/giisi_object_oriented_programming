
public class PruebaPersona {
    public static void main(String[] args){
         Persona p = new Persona ("Laura","Díaz","Sáez");
         p.setEdad(18);
         System.out.println("Edad = " + p.getEdad());
         p.setEdad(-30);
         System.out.println("Edad = " + p.getEdad());
         System.out.println("Nombre y apellidos: " + p.getNombre() + p.getApellido1() + p.getApellido2());
    }
   
}
