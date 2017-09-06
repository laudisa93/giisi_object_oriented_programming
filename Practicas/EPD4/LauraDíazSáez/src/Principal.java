
public class Principal {

    public static void main(String[] args) {

        Propietario p = new Propietario("28.987.654-W", "Perez Gomez", "Manuel");

        Automovil c1 = new Vehiculo("0000ABC", "Seat", false, 15, 60, "28", "Perez Gomez", "Manuel");
        Automovil c2 = new Vehiculo("9999BAA", "Renault", true, 25, 80, "75", "Rodri�guez Lopez", "Ana");
        Automovil c3 = new Vehiculo("4444CBA", "Fiat", true, 20, 70, "73", "Alonso DelCaso", "Marisa");

        Motocicleta m1 = new Vehiculo("0000ZYZ", "Yamaha R6", false, 9, 17, "75", "Rodriguez Lopez", "Ana");
        Motocicleta m2 = new Vehiculo("8888FYZ", "Honda CBR 1100", false, 8, 24);
        Motocicleta m3 = new Vehiculo("9999PPZ", "Honda X8R", false, 13, 30);
        Motocicleta m4 = new Vehiculo("5555ZJZ", "Honda CBR 500", false, 5, 6);

        m2.setTitular(p);
        m3.setTitular(p);

        c1.repostar(10); // Repostar al 10% de la capacidad de c2
        c2.repostar();  // Repostar al 100% de la capacidad de m2
        c2.repostar(120);  // Repostar al 120% de la capacidad de m2
        
        c1.transferirCombustible(c2);        
        c3.transferirCombustible(c2);        

        m2.repartirCombustible(m3, m4);
        m1.repartirCombustible(m2, m3);//En este método se toman dos objetos de la clase Motocicleta y uno de Vehiculo.
       
        
    }
}
