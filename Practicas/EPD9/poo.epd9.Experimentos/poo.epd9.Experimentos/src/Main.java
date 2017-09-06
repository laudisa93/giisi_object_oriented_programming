
public class Main {

    public static void main(String[] args) {
        Positivo p = null;
        try{
            p = new Positivo(-3);
            System.out.println("Número:" + p.getNumero());
        }catch(Exception e){
            System.out.println(e.getMessage());
            try {
            p = new Positivo(0);
            System.out.println("Número:" + p.getNumero());
            } catch(Exception e1){
                System.out.println(e1.getMessage());
            }
        }
        try{
            p.divide(new Positivo(0));
            System.out.println("División:" + p.getNumero());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
