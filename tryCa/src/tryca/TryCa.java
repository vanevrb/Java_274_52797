package tryca;

import javax.swing.JOptionPane;

public class TryCa {

    public static void main(String[] args) {
        
        
        try
        {
            int num;
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            JOptionPane.showMessageDialog(null,"El numero ingresado es: "+num);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Se esperaba un numero, Ingrese un numero entero valido","Se genero un error!!!!!!!!!!",JOptionPane.WARNING_MESSAGE);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"El valor ingresado no es valido");
            //JOptionPane.showMessageDialog(null,"El error generado es: "+e);
        }
        finally{
            //finally
        }
    
    }

}
