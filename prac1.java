public class prac1 {
public static void main (String [] args){
    String Cadena = "hola mundo";
    int Edad =  20 ;
    double Altura =  1.75 ;


    System.out.println( Cadena );
    System.out.println( " Edad " + Edad );
    System.out.println( " Altura " + Altura + " Metros " );

    System.out.println("--------------------");
    System.out.println("creando tipo de dato abstracto");
    System.out.println();
    Datos persona = new Datos ("juan perez" , 25,"juan@hotmail.com");
    System.out.println(" Nombre "  + persona.getNombre());
    System.out.println(" Edad "  + persona.getEdad());
    System.out.println(" Correo "  +  persona.getCorreo());
    
    Datos persona2 = new Datos();
    persona2.setNombre(" maria lopez ");
    persona2.setEdad(30);
    persona2.setCorreo(" maria@hotmail.com ");
    System.out.println(" Nombre " + persona2.getNombre());
    System.out.println(" Edad "+ persona2.getEdad());
    System.out.println(" Correo "+ persona2.getCorreo());    
}
}