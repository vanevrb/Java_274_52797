package proyectoa;

public class Main {

    public static void main(String[] args) {
        int edad=12;
        boolean resultado=c1.resultado(edad);
        System.out.println("Si es mayor de edad true, si es menor false:"+resultado);
               
        bloque2();
        System.out.println("------");
        System.out.println("Aqui esta el numero de la clase c1:"+c1.b_numero(3));
        bloque1();
        
        c1.b1();
        c1.b3();
        c1.b2();

    }
    public static void bloque1(){
        System.out.println("Soy el bloque 1");
    }
    public static void bloque2(){
        System.out.println("Soy el bloque 2");
    }

}
