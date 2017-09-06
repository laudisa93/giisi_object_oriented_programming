
public class Asignatura implements IAsignatura, Comparable {

    private String codigo;
    private String nombre;
    private String acronimo;
    private int curso;
    private int semestre;
    private int creditos;

    public Asignatura(String codigo, String nombre, String acronimo, int curso, int semestre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.acronimo = acronimo;
        this.curso = curso;
        this.semestre = semestre;
        this.creditos = creditos;
    }

    public String toString() {
        String s;
        s = acronimo + " (" + curso + "º/" + semestre + "/" + creditos + "cr.)";
        return s;
    }

    public boolean equals(Object o) {
        return getCodigo().equals(((Asignatura)o).getCodigo());
    }

    public int compareTo(Object o) {
        return getCodigo().compareTo(((Asignatura)o).getCodigo());
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public int getCurso() {
        return curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getCreditos() {
        return creditos;
    }

}
