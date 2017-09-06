import poo.io.*;
public class Principal {

    
    public static void main(String[] args) {
        int iCodigo,iAnio;
        String sAutor,sTitulo;
        
       Libro oLibro1 = new Libro(001,"Daniel Muñiz Amian","Aprende a programar en 5 minutos",2012);
       Libro oLibro2 = new Libro(002,"Daniel Muñiz Amian","Aprende a ingerir bombillas",2012);
       Revista oRevista1 = new Revista(001,"Sevilla FC","SEVILLA F.C. PERIODICO",2010);
       Revista oRevista2 = new Revista(002,"El Moscas","Investigación de las moscas",2012);
       Disco oDisco = new Disco(001,"Cateto","Todo por un disco",2011);
       
       System.out.println("Introduce el CÓDIGO del disco: ");
       iCodigo=(int)IO.readNumber();
       System.out.println("Introduce el AUTOR del disco: ");
       sAutor=(String)IO.readLine();
       System.out.println("Introduce el TÍTULO del disco: ");
       sTitulo=(String)IO.readLine();
       System.out.println("Introduce el ANO del disco: ");
       iAnio=(int)IO.readNumber();
       
       Disco oDisco2 = new Disco(iCodigo,sAutor,sTitulo,iAnio);
       
       
       System.out.println("\nLIBRO CON CÓDIGO: "+oLibro1.getCodigo()+"\nTÍTULO: "+oLibro1.getTitulo()+"\nAUTOR: "+oLibro1.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oLibro1.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oLibro1.getPrestamo());
       System.out.println("\nLIBRO CON CÓDIGO: "+oLibro2.getCodigo()+"\nTÍTULO: "+oLibro2.getTitulo()+"\nAUTOR: "+oLibro2.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oLibro2.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oLibro2.getPrestamo());
       System.out.println("\nREVISTA CON CÓDIGO: "+oRevista1.getCodigo()+"\nTÍTULO: "+oRevista1.getTitulo()+"\nAUTOR: "+oRevista1.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oRevista1.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oRevista1.getPrestamo());
       System.out.println("\nREVISTA CON CÓDIGO: "+oRevista2.getCodigo()+"\nTÍTULO: "+oRevista2.getTitulo()+"\nAUTOR: "+oRevista2.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oRevista2.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oRevista2.getPrestamo());
       System.out.println("\nDISCO CON CÓDIGO: "+oDisco.getCodigo()+"\nTÍTULO: "+oDisco.getTitulo()+"\nAUTOR: "+oDisco.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oDisco.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oDisco.getPrestamo());
       
       System.out.println("\n\nMODIFICACIONES\n\n");
       
       oLibro1.setAutor("Daniel Muñiz");
       oLibro1.prestar();
       
       oLibro2.setAnioPublicacion(2010);
       oLibro2.prestar();
       
       oRevista1.setTitulo("SEVILLA F.C. - EL PREIÓDICO");
       
       oRevista2.setAutor("El moscas - The FLY");
       
       oDisco.setAutor("El Cateto");
       oDisco.prestar();
       
       System.out.println("\nLIBRO CON CÓDIGO: "+oLibro1.getCodigo()+"\nTÍTULO: "+oLibro1.getTitulo()+"\nAUTOR: "+oLibro1.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oLibro1.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oLibro1.getPrestamo());
       System.out.println("\nLIBRO CON CÓDIGO: "+oLibro2.getCodigo()+"\nTÍTULO: "+oLibro2.getTitulo()+"\nAUTOR: "+oLibro2.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oLibro2.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oLibro2.getPrestamo());
       System.out.println("\nREVISTA CON CÓDIGO: "+oRevista1.getCodigo()+"\nTÍTULO: "+oRevista1.getTitulo()+"\nAUTOR: "+oRevista1.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oRevista1.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oRevista1.getPrestamo());
       System.out.println("\nREVISTA CON CÓDIGO: "+oRevista2.getCodigo()+"\nTÍTULO: "+oRevista2.getTitulo()+"\nAUTOR: "+oRevista2.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oRevista2.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oRevista2.getPrestamo());
       System.out.println("\nDISCO CON CÓDIGO: "+oDisco.getCodigo()+"\nTÍTULO: "+oDisco.getTitulo()+"\nAUTOR: "+oDisco.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oDisco.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oDisco.getPrestamo()+"\n\n");
       
       oDisco.devolver();
       oDisco.retirar();
       oDisco.prestar();
       oDisco.devolverEstado();
       oDisco.prestar();
       
       System.out.println("\nDISCO CON CÓDIGO: "+oDisco.getCodigo()+"\nTÍTULO: "+oDisco.getTitulo()+"\nAUTOR: "+oDisco.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oDisco.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oDisco.getPrestamo());
       
       System.out.println("\nDISCO CON CÓDIGO: "+oDisco2.getCodigo()+"\nTÍTULO: "+oDisco2.getTitulo()+"\nAUTOR: "+oDisco2.getAutor()+"\nAÑO DE PUBLICACIÓN: "+oDisco2.getAnioPublicacion()+"\nESTADO DEL LIBRO: "+oDisco2.getPrestamo());
       
    }
}
