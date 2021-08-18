package operaciones;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        int numero;
        int mod;
        boolean condicion;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        numero = leer.nextInt();
        mod=numero%2;
        System.out.println("El numero ingresado es: " + numero);
        
        condicion=(numero==2);
        
        System.out.println("La condicion es " + condicion);
        if(condicion){
            System.out.println("El numero ingreso es 2" );
            //true
        }
        else{
            System.out.println("El numero ingreso no es 2" );
            //false
        }
        int i=0;

        do {
        //-----
            System.out.println("i es "+i);
            i=i+1;
        } while(i<8);

        int r;
        for(r=0;r<8;r++){
            System.out.println("Estoy en el recorrido numero "+r);
        }
    
        
        
        
    }

}
