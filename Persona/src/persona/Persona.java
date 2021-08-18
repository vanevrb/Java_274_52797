package persona;

public class Persona {

    public static void main(String[] args) {
        String primerNombre="Vanessa";
        String primerApellido="Rodriguez";
        int edad =19;
        String profesion="Ingeniera de sistemas";
        String genero="Femenino";
        int cedula=789897789;
        String Mensaje="Nombre: "+primerNombre+" "+primerApellido;
        
        System.out.println(Mensaje);
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+ edad);
        System.out.println("Profesion: "+profesion);
        System.out.println("Genero: "+genero);
        
        if (edad>=18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
        
    }

}
