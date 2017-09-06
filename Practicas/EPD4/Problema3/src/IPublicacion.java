/*En una biblioteca existen una serie de publicaciones, que tienen las propiedades de código, autor, título, año de publicación y
una propiedad que indica si el libro está prestado. Defina las clases necesarias para implementar un programa con las siguientes
características:
a) Una Interfaz IPublicacion, que defina los métodos consultores y modificadores de las propiedades antes mencionadas.
b) Defina 3 clases que se correspondan con Libro, Revista y Disco, que implementen la interfaz IPublicacion.
c) Cada clase debe tener un constructor que reciba como parámetros los datos de las propiedades definidas. La propiedad
que indica si el libro está prestado o no, deberá inicializarse por defecto a falso.

f) Las clases Libro y Disco son publicaciones prestables, por lo que deben implementar también la interfaz IPrestable.
 */
public interface IPublicacion {
    //CONSULTORES
    public int getCodigo();
    public String getAutor();
    public String getTitulo();
    public int getAñoPublicacion();
    public boolean isPrestado();
    //MODIFICADORES
    public void setCodigo();
    public void setAutor();
    public void setTitulo();
    public void setAñoPublicacion();
    public void setPrestado();
}
