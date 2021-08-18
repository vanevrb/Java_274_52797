package concepto;

import java.util.Scanner;
public class Concepto {

    public static void main(String[] args) {
        // A continuacion los diferentes tipos de variables
        /*
        1er comentario
        2do Comentario
        .
        .
        .
        */
        int numero;
        int mod;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("ingresa un numero: ");
        numero = leer.nextInt();
        mod=numero%2;
        System.out.println("el resto del numero con 2 es: " + mod);
        /*
        Determinar del 1 al 10 cuantos numeros son pares
        
        
        */
        int isInt=2;
        float isFloat=5.4f;
        boolean isBoolean=true;
        String isString= "Soy un string";
        System.out.println("Es un entero "+isInt);
        System.out.println("Es un flotante "+isFloat);
        System.out.println("Es un Booleano"+isBoolean);
        System.out.println(isString);
        /* -- Calculos --- */
        int primerNumero = 3;
        int segundoNumero= 5;
        int suma=primerNumero + segundoNumero;
        int resta=primerNumero - segundoNumero;
        double producto=primerNumero * segundoNumero;
        double division=primerNumero /  segundoNumero;
        System.out.println("Una suma:"+suma);
        System.out.println("Una resta:"+resta);
        System.out.println("Un producto:"+producto);
        System.out.println("Una division:"+division);
        
        
        
    }

}
