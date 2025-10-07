public class Datos {

    private String Nombre;
    private int Edad;
    private String Correo;

    public Datos (String Nombre, int Edad, String Correo){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Correo = Correo;
    } 

    public Datos(){}
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public int getEdad(){
        return Edad;
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public String getCorreo(){
        return Correo;
    }
    public void setCorreo(String Correo){
        this.Correo = Correo; 
    }

}
