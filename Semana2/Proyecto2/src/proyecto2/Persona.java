package proyecto2;

public class Persona {

    public String primerNombre;
    public String primerApellido;
    public int edad;
    public char genero;// F o M
    public int cedula;
    public String profesion;

    //constructor
    public Persona(String primerNombre, String primerApellido,
            int edad, char genero, int cedula, String profesion) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
        this.genero = genero;
        this.cedula = cedula;
        this.profesion = profesion;
    }

    public boolean esMayorEdad() {
        return (edad >= 18);
    }

}
