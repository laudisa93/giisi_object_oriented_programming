/*En cuestión de telefonía, existen distintos tipos de teléfonos que podrían clasificarse de manera general como: Móvil, Fijo o
 Satélite. Desarrolle una implementación de un programa que contemple las siguientes características:
 a) Una Interfaz ITelefono, que defina las operaciones comunes de un teléfono de forma genérica, que serán:
 • consultarNumero
 • marcar
 • colgar
 • activarAltavoz
 • desactivarAltavoz
 • sonarTimbre
 b) Defina las 3 implementaciones mencionadas anteriormente, con los nombres Movil, Fijo, Satelite.
 c) Cada una de las clases debe tener un constructor que reciba como parámetro el número de teléfono que le corresponde.
 d) Cada método debe imprimir por pantalla un mensaje anunciando que se está realizando la operación, colocando en los
 mensajes el tipo de teléfono que está operando.
 e) Desarrolle un programa principal que haga uso de estas clases, creando un teléfono de cada tipo, haciendo el uso
 correcto de la interfaz ITelefono.
 f) Cada teléfono creado, debe realizar todas las operaciones, para verificar que se muestra por pantalla el mensaje correcto
 
 */

public interface ITelefono {

    public void consultarNumero();

    public void marcar(int n);

    public void colgar();

    public void activarAltavoz();

    public void desactivarAltavoz();

    public void sonarTimbre();
}
