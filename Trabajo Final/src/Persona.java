import java.util.Comparator;

public class Persona implements IPersona {

    private String nombre;
    private String domicilio;
    private String dni;
    private char sexo;

    public Persona(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    protected Persona(IPersona persona) {
        this.nombre = persona.getNombre();
        this.domicilio = persona.getDomicilio();
        this.dni = persona.getDNI();
        this.sexo = persona.getSexo();
    }

    public String toString() {
        return "\nDatos Personales de: " + nombre + "\n\tDNI: " + dni + "\n\tDomicilio: " 
                + domicilio + "\n\tSexo: " + sexo + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) throws PersonaErronea{
        int i;
        boolean esNumero = true, esLetra=false;
        i=0;
        while(i<dni.length()-2 && esNumero==true){
            if(!Character.isDigit(dni.charAt(i))){
                esNumero=false;
            }
            i++;           
        }
        if(Character.isLetter(dni.charAt(dni.length()-1))){
            esLetra=true;
        }
        if(esNumero==true && esLetra==true){
            this.dni=dni;
        }else{
            throw new PersonaErronea(this.dni + " - DNI debe contener 8 digitos y una letra!!\n");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) throws PersonaErronea{
        if(sexo!='m' && sexo!='f'){
            throw new PersonaErronea("El sexo de " + this.nombre 
                    + " es incorrecto. Por favor, escriba 'm' para masculino o 'f' para femenino\n");
        }else{
            this.sexo = sexo;
        }
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
