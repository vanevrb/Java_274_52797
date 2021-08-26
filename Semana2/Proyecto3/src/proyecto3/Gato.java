package proyecto3;

public class Gato extends Animal {
    private String atributoGato;

    public Gato(String nombre, String raza, String color, int identificacion, String atributoGato) {
        super(nombre, raza, color, identificacion);
        this.atributoGato = atributoGato;
    }

    public String getAtributoGato() {
        return atributoGato;
    }

    public void setAtributoGato(String atributoGato) {
        this.atributoGato = atributoGato;
    }
    
    public String sonido (){
        return "Miauuuuuu";
    }
    public void info(){
        System.out.println("-------------------------");

        System.out.println("Nombre: "+getNombre()
                +"\nRaza: "+getRaza()
                +"\nColor: "+getColor()
                +"\nIdentificacion: "+getIdentificacion()
                +"\nAtributo del perro: "+getAtributoGato()
        );
    }
}
