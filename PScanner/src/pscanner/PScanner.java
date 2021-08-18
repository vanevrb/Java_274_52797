package pscanner;

import java.util.Scanner;
import java.lang.Math;

public class PScanner {

    public static void main(String[] args) {
      //variables
      /*
      String esString;
      double esDouble;
      int esEntero;
      
      Scanner in = new Scanner(System.in);
      
      System.out.print("Por favor ingrese un entero: ");
      esEntero = in.nextInt();
      System.out.println("El entero ingresado es:"+ esEntero);
      */
      //variables
      int primerNumero, segundoNumero;
      double resultado_suma;
      double resultado_resta;
      double resultado_mult;
      double resultado_div;
      double raiz_cuadrada;
      
      Scanner in = new Scanner(System.in);
      
      System.out.print("Ingrese el primer numero: ");
      primerNumero = in.nextInt();
      
      System.out.print("ingrese el segundo numero: ");
      segundoNumero = in.nextInt();
      
      resultado_suma = primerNumero + segundoNumero;
      resultado_resta = primerNumero - segundoNumero;
      resultado_mult = primerNumero * segundoNumero;
      resultado_div = primerNumero / segundoNumero;
      
      raiz_cuadrada = Math.sqrt(resultado_suma);
      
      System.out.println("La suma de los dos numeros es: "+resultado_suma);
      System.out.println("La resta de los dos numeros es: "+resultado_resta);
      System.out.println("El producto de los dos numeros es: "+resultado_mult);
      System.out.println("La division de los dos numeros es: "+resultado_div);
      System.out.println("La raiz cuadrada del resultado de la suma es: "+raiz_cuadrada);
      
    }

}
