
public class Profesor implements IProfesor {
    //todos son package porque no se pone ni public, ni protected, ni private

    String apellidos, dni, nombre, universidad;
    int edad, sueldo, antiguedad, numeroAlumnos;
    boolean funcionario;//java lo pone a false por defecto

    public Profesor(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cumpleAnios() {
        setEdad(this.edad/*=getEdad()*/ + 1);
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void subirSueldo(int porcentaje) {
        setSueldo((int) (sueldo + (porcentaje / 100.0) * sueldo));
        //sueldo*=porcentaje*sueldo/100;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public boolean isFuncionario() {
        return funcionario;
    }

    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }

    public void aprobarOposiciones() {
        setFuncionario(true);
    }

    public String toString() {
        String s; //crear una cadena y despues devolverla
        s = "\n\nPROFESOR ";
        if (isFuncionario()) {
            s = s + "CONTRATADO\n";
        } else {
            s = s + "FUNCIONARIO\n";
        }
        s = s + getNombre() + " " + getApellidos() + " (" + getDni() + ")\nEdad: " + getEdad() +"\nDNI: " + getDni() + "\nSueldo: " + getSueldo() + "\nAntigüedad: " + getAntiguedad() + "\nUniversidad: " + getUniversidad() + "\nNúmero de Alumnos: " + getNumeroAlumnos();
        return s;
    }
    public boolean equals(Object o){
        boolean res = false;
        if (o instanceof Profesor){
            res=getDni().equals(((Profesor)o).getDni());
        }
        return res;
    }
}
