package proyecto2;

public class Vehiculo {
   public String marca;
   public String color;
   public String modelo;
   public String placa;
   
   public Vehiculo(String marca,String color,
           String modelo, String placa){
       this.marca = marca;
       this.color = color;
       this.placa = placa;
       this.modelo = modelo;
   }
   public String getInfo(){
       return "Marca: "+marca+
               "\nColor: "+color+
               "\nModelo: "+modelo+
               "\nPlaca: "+placa;
   }
}    
