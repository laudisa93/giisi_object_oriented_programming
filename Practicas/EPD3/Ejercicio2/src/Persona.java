
/*d) Modifique la implementación de los métodos modificadores de la clase anterior de forma tal que se cumplan las siguientes 
 reglas a la hora de modificar los diferentes atributos:
 • nombre, apellido1, apellido2: No pueden ser modificados (declare los métodos modificadores en la clase como 
 privados).
 • edad: No puede ser menor que cero ni mayor que 150. Cuando se modifique se comprobará que el nuevo valor 
 es mayor que el antiguo.
 • estatura: No puede ser menor que cero ni mayor que 3 metros.
 • peso: No puede ser menor que cero ni mayor que 300 kilos.
 • estado: Una persona soltera sólo puede pasar a casada. Una persona casada no puede pasar a ser soltera. 
 Una persona separada sólo puede pasar a divorciada o viuda. Una persona divorciada sólo puede pasar a 
 casada. Una persona viuda sólo puede pasar a casada.
 En el caso de que alguna regla de las que  se han establecido anteriormente no se cumpla, el método modificador no 
 llevará a cabo la modificación, terminando su ejecución sin hacer la misma.
 * e) Cree un programa principal que demuestre que las reglas de los métodos modificadores pueden ser violadas accediendo 
 directamente a los atributos públicos, y que no pueden ser violadas haciendo las modificaciones empleando los métodos 
 modificadores.
 f) Modifique la clase Persona de tal forma que sea imposible por ningún medio realizar modificaciones violando las reglas 
 establecidas en los métodos modificadores. Cree un programa que demuestre que efectivamente es imposible realizar 
 esas violaciones aunque se intente forzar a los métodos modificadores con valores que violan dichas reglas.
 */
public class Persona {
    /*
     * Cree una clase Persona que tenga las siguientes características: a) La
     * clase debe contener los siguientes atributos públicos: • nombre:
     * Almacenará el nombre de la persona. • apellido1: Almacenará el primer
     * apellido de la persona. • apellido2: Almacenará el segundo apellido de la
     * persona. • edad: Almacenará la edad de la persona. • estatura: Almacenará
     * la estatura de la persona (medida en metros). • peso: Almacenará el peso
     * de la persona (medida en kilos). • estado: Almacenará el estado civil de
     * la persona. El atributo estado puede tener los siguientes valores con los
     * significados asociados: 1 – SOLTERO; 2 – CASADO; 3 – SEPARADO; 4 –
     * DIVORCIADO; 5 – VIUDO
     */

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private double estatura;
    private double peso;
    private int estado;

    /*
     * b) La clase Persona deberá de incorporar los métodos consultores y
     * modificadores apropiados para los atributos de la clase. c) La clase
     * Persona dispondrá de un método constructor que permitirá inicializar los
     * atributos nombre, apellido1 y apellido2.
     */
    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if ((edad >= 0) && (edad <= 150)) {
            this.edad = edad;
        }
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if ((estatura > 0) && (estatura < 3)) {
            this.estatura = estatura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if ((peso > 0) && (peso < 300)) {
            this.peso = peso;
        }
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        switch (this.estado) {
            case 1:
                if (estado == 2) {
                    this.estado = estado;
                }
            case 2:
                if ((estado == 3) || (estado == 4) || (estado == 5)) {
                    this.estado = estado;
                }
            case 3:
                if ((estado == 4) || (estado == 5)) {
                    this.estado = estado;
                }
            case 4:
                if (estado == 2) {
                    this.estado = estado;
                }
            case 5:
                if (estado == 2) {
                    this.estado = estado;
                }
        }

    }

    public String numeroEstado() {
        String s = null;
        switch (estado) {
            case 1:
                s = "SOLTERO";
                break;
            case 2:
                s = "CASADO";
                break;
            case 3:
                s = "SEPARADO";
                break;
            case 4:
                s = "DIVORCIADO";
                break;
            case 5:
                s = "VIUDO";
                break;
        }
        return s;
    }
}
