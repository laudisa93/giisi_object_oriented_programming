
public class Experimento4 {

    public static void main(String[] args) {
        UsuarioMetro v1 = new ViajeroOcasional(9650, "Pablo de Olavide", "Gran Plaza");
        UsuarioMetro v2 = new ViajeroAbonado(9700, "Montequinto", "San Bernardo");
        v1.viajar();
        v2.viajar();
    }
}
/*Implemente lo que sea necesario en dos clases hijas de UsuarioMetro
 (ViajeroOcasional y ViajeroAbonado) para que la salida de
la ejecución de la clase principal sea:
Viajero 9650: Pablo de Olavide - Gran Plaza. Ha validado su billete univiaje.
Viajero 9700: Montequinto - San Bernardo. Ha validado su abono de transportes.*/