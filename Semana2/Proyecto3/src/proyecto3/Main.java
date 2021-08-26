package proyecto3;

public class Main {
   // String nombre, String raza, String color, int identificacion,String atributoUnicoPerro
    public static void main(String[] args) {
        Perro p1 = new Perro("Pulgas","Pincher", "negro", 213231,"Tiene Garras");
        p1.info();
        System.out.println(p1.comer());
        System.out.println(p1.dormir());
        
        Perro p2 = new Perro("Bruno","Rotwel", "beige", 651564,"No Tiene Garras");
        p2.info();
        System.out.println(p2.sonido());
        System.out.println("-----------Aves------------");
        
        Ave a2 = new Ave("Loreta","Canario", "rojo", 5665);
        a2.info();
        System.out.println(a2.sonido());
        System.out.println(a2.dormir());
    }

}
