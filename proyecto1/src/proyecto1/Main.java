package proyecto1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int op;

        Scanner in = new Scanner(System.in);

        System.out.println("Favor ingrese el primer numero");
        numero1 = in.nextInt();
        System.out.println("Favor ingrese el segundo numero");
        numero2 = in.nextInt();

        try {
            do {
                System.out.println("Favor selecciones una la siguientes opciones"
                        + "\n1. Sumar"
                        + "\n2. Multiplicar"
                        + "\n3. Dividir"
                        + "\n4. Minimo de dos numeros"
                        + "\n5. Salir"
                );
                op = in.nextInt();

                switch (op) {
                    case 1:
                        Operaciones.imprimir_suma(numero1, numero2);
                        break;

                    case 2:
                        Operaciones.imprimir_producto(numero1, numero2);
                        break;

                    case 3:
                        Operaciones.imprimir_division(numero1, numero2);
                        break;

                    case 4:
                        Operaciones.minimo_de_dos_numeros(numero1, numero2);
                        break;
                    case 5:
                        //salir
                        break;

                }
            } while (op != 5);//opcion 5 para salir
        } catch (Exception e) {
            System.out.println("Ingrese una opcion valida");
        }

    }

}
