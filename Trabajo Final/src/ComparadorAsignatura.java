
import java.util.*;

class ComparadorAsignatura implements Comparator {

    public int compare(Object o1, Object o2) {
        IAsignatura asig1 = (Asignatura) o1;
        IAsignatura asig2 = (Asignatura) o2;
        int cmp;
        cmp = asig1.getCurso() - asig2.getCurso(); //Primero por curso
        if (cmp == 0) {//Luego por semestre, acronimo, nombre y creditos
            cmp = asig1.getSemestre() - (asig2.getSemestre());
            if (cmp == 0) {
                cmp = asig1.getAcronimo().compareTo(asig2.getAcronimo());
                if (cmp == 0) {
                    cmp = asig1.getNombre().compareTo(asig2.getNombre());
                    if(cmp==0){
                        cmp=asig1.getCreditos()-(asig2.getCreditos());
                        return cmp;
                    }else{
                        return cmp;
                    }
                }else{
                    return cmp;
                }
            }else{
                return cmp;
            }
        }else{
            return cmp;
        }
    }
}