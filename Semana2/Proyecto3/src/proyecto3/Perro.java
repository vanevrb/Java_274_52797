package proyecto3;

public class Perro extends Animal {
    private String atributoPerro;

    public Perro(String nombre, String raza, String color, int identificacion,String atributoPerro) {
        super(nombre, raza, color, identificacion);
        this.atributoPerro = atributoPerro;
    }

    public String getAtributoPerro() {
        return atributoPerro;
    }

    public void setAtributoPerro(String atributoPerro) {
        this.atributoPerro = atributoPerro;
    }
    
    
    public String sonido(){
     return "Wuauuuuuuuuu";
    }
    public void info(){
        System.out.println("-------------------------");
        System.out.println("Nombre: "+getNombre()
                +"\nRaza: "+getRaza()
                +"\nColor: "+getColor()
                +"\nIdentificacion: "+getIdentificacion()
                +"\nAtributo del perro: "+getAtributoPerro()
        );
    }
}
