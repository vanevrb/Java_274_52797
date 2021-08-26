package proyecto3;

public class Ave extends Animal{

    public Ave(String nombre, String raza, String color, int identificacion) {
        super(nombre, raza, color, identificacion);
    }
    public void info(){
        System.out.println("-------------------------");

        System.out.println("Nombre: "+getNombre()
                +"\nRaza: "+getRaza()
                +"\nColor: "+getColor()
                +"\nIdentificacion: "+getIdentificacion()
        );
    }
}
