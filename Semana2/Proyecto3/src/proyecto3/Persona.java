package proyecto3;

public class Persona {

    private String primerNombre;
    private String primerApellido;
    private int edad;
    private char genero;// F o M
    private int cedula;
    private String profesion;

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    

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

