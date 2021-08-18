package list;

public class List {

    public static void main(String[] args) {
        String[] listasuper ={"Papa","Yuca","Arroz","Carne","Cereal", "Limones"};
         /*                      0      1      2       3       4          5
        
        */       
        listasuper[0] = "habichuelas"; //cambiamos el valor
        System.out.println("El elemento 1 de la lista super 1 es "+listasuper[0]);
         
        String[] listasuper2 = new String[3];
        listasuper2[0]="Empanadas para fritar";
        listasuper2[1]="Chicharrones para fritar";
        listasuper2[2]="Detodito con todo";
        
        
        System.out.println("El elemento 2 de la lista del super 2 es "+listasuper[1]);

        int[] numeros = {2342,2342,7876897,343434,234};
        /*                 0    1      2      3    4
        
        */
        
        
        System.out.println("la cantidad de numeros en el arreglo es "+numeros.length);
        
        for(int i=0; i<numeros.length;i++){
            System.out.println("El numero en la posicion "+i+" es "+numeros[i]);
        }
        
        
        System.out.println("imprimir la lista del super");
        System.out.println(listasuper);

        
    }

}
