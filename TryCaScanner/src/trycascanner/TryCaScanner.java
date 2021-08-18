package trycascanner;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCaScanner {

   public static void main(String[] args) {
        
        try
        {
            int num;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
            
            System.out.println("El numero ingresado es: "+num);
         
        }
        catch (InputMismatchException e){
            System.out.println("Debe ingresar un numero");
        }
        catch (Exception e)
        {
            System.out.println("Debe ingresar un dato valido");
        }
        finally{
            System.out.println("Se realizo un try Catch en este codigo capturando el error InputMismatchException");
            //finally
        }
    
    }

}
