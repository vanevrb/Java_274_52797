package proyecto2;

public class Perro {
     public String nombre;
     public String color;
     public String raza;
     public String tamano;
     public int edadMeses;
     public boolean peligrosidad;
     public char sexo; //H o M
     public Perro(String nombre,String color,String raza,String tamano,
             int edadMeses,boolean peligrosidad,char sexo){
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.tamano = tamano;
        this.edadMeses = edadMeses;
        this.peligrosidad = peligrosidad;
        this.sexo = sexo;
     }
     public String getInfo(){
         return "\nSexo: "+sexo+
                 "\nColor: "+color +
                 "\nRaza:"+raza+
                 "\nTamaño:"+tamano+
                 "\nTiene "+edadMeses+" meses de edad";
     }
}
