package menu;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
       //variable
       int esEntero1;
       int esEntero2;
       int op;
       
       esEntero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer valor entero: "));
       esEntero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo valor entero: "));

       op = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opcion del 1 al 3:"
            + "\n1.Sumar"
            + "\n2.Multiplicar"
            + "\n3.Restar"
       ));
       
       switch(op){
           case 1:
               JOptionPane.showMessageDialog(null,"La suma de los dos numeros es: "+(esEntero1+esEntero2));
           break;
           case 2:
               JOptionPane.showMessageDialog(null,"El producto de los dos numeros es: "+(esEntero1*esEntero2));

           break;
           case 3:
               JOptionPane.showMessageDialog(null,"La resta de los dos numeros es: "+(esEntero1-esEntero2));

           break;
           default:
               JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");

           break;
       }
    }

}
