package proyecto2;

public class Main {

    public static void main(String[] args) {
     /*nombre color raza tamano edadMeses peligrosidad  sexo H o M*/
         Vehiculo v1 = new Vehiculo("Renault","Rojo","2018","AVG421");
         System.out.println(v1.getInfo());
     
         Perro p1 = new Perro("Pulgas","Negro","Pincher","Pequeño",2,false,'H');
         Perro p2 = new Perro("Bruno","Beige","Pug","Mediano",7,false,'M');
         System.out.println("----------------------------");
         System.out.println("El perro "+p1.nombre+":");
         System.out.println(p1.getInfo());
         System.out.println("----------------------------");
         System.out.println("El perro "+p2.nombre+":");
         System.out.println(p2.getInfo()); 
       // (String primerNombre,String primerApellido,int edad,char genero,int cedula,String profesion)
         Persona persona1 = new Persona("Pablo","Emilio",30,'M',1213123,"Ingeniero de redes");
         Persona persona2 = new Persona("Juana","Caballero",15,'H',1213123,"Estudiante");
         String mensaje;
         
         mensaje = mensajeDeMayorDeEdad(persona1.esMayorEdad());
             
         System.out.println("La persona 1 "+ mensaje);
         
         mensaje = mensajeDeMayorDeEdad(persona2.esMayorEdad());
             
         System.out.println("La persona 2 "+ mensaje);       
    }
    private static String mensajeDeMayorDeEdad (boolean esMayorDeEdad){
        return (esMayorDeEdad) ? "Es Mayor de Edad" : "Es Menor de Edad";
    }

}
