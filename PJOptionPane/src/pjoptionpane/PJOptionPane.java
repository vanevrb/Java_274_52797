package pjoptionpane;

import javax.swing.JOptionPane;
import java.lang.Math;

public class PJOptionPane {

    public static void main(String[] args) {
        int esEntero1;
        int esEntero2;
        String esString;
        double esDouble;
        char esCar;
        double suma;
        double raiz_suma;
        double min;
        
        JOptionPane.showMessageDialog(null, "Advertencia solo ingresar numeros enteros","Advertencia - importante",JOptionPane.WARNING_MESSAGE);
        esEntero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer valor entero: "));
        esEntero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo valor entero: "));
        esString = JOptionPane.showInputDialog("Ingrese un mensaje para mostrar");
        esDouble = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del producto"));
        esCar = JOptionPane.showInputDialog("Ingresa un caracter").charAt(0);
        suma = esEntero1 + esEntero2;
        raiz_suma = Math.sqrt(suma);
        min =Math.min(esEntero1, esEntero2);
        JOptionPane.showMessageDialog(null,"Los valores ingresados son:"
                + "\nPara el entero 1: "+esEntero1
                + "\nPara el entero 2: "+esEntero2
                + "\nPara el mensaje: "+esString
                + "\nPara el caracter: "+esCar
                + "\nPara el costo: "+esDouble
                + "\nLa suma de valores es: "+suma
                + "\nLa raiz cuadrada del resultado de la suma es: "+raiz_suma
                + "\nEl minimo de los enteros registrados es:"+min
        );
        JOptionPane.showMessageDialog(null,"Gracias por responder","Gracias",JOptionPane.QUESTION_MESSAGE);
    }

}
