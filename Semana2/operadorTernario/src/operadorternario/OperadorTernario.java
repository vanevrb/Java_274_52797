package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        boolean condicion = false;
        
        String respuesta;
        /*
            if (condicion){
            respuesta="Es verdadera";
        }
        else{
            respuesta = "Es falsa";
        }
         */
        
        respuesta = (condicion) ? "Es verdadera" : "Es falsa";
        System.out.println(respuesta);
        
        // un estudiante pasa la materia con una calificacion mayor o igual a 3
        String mensaje;
        int calificacion = 4;
        
        mensaje = (calificacion>=3) ? "Pasaste la materia :)" : "No pasaste la materia :(";
        System.out.println(mensaje);
        
        // Si es femenino o Masculino
        char genero = 'F';
        
        mensaje = (genero=='F') ? "Es femenino" : "Es masculino";
        System.out.println(mensaje);
        
        // Es Mayor de edad --- Si tiene 18 o mas "Es mayor de Edad" de lo contraio "Es menor de Edad"
        
        int edad = 2;
        condicion = (edad >=18);
        mensaje = (condicion) ? "Es mayor de Edad" : "Es menor de Edad";
        System.out.println(mensaje);
        
        
        // Un numero sea igual a 3 o de lo contraio "No es igual a 3"
        
        int numero=3;
        mensaje = (numero==3) ? "Es igual a 3" : "No es igual a 3";
        System.out.println(mensaje);
        
        //condiciones con operadores
        
        condicion = (4>5 && true);
        mensaje = (condicion) ? "Es verdadera" : "Es falsa";
        System.out.println(mensaje);
        
}

}
