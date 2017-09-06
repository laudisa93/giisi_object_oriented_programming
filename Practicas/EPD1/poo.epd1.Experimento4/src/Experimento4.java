
public class Experimento4 {

    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = 11;
        z = x + y / 2;
        if (x > y) {
            if (x > z) {
                System.out.println("x es el máximo");
            } else {
                System.out.println("z es el máximo");
            }
        } else if(y>z){
            System.out.println("y es el máximo");
        } else {
            System.out.println("z es el máximo");
        }
    }
}
