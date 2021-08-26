package encapsulamiento;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pablo", "Emilio", 30, 'M', 1213123, "Ingeniero de redes");
        Persona persona2 = new Persona("Juana", "Caballero", 15, 'H', 1213123, "Estudiante");
        System.out.println("Obtenemos la edad");
        System.out.println(persona2.getEdad());
        System.out.println("Cambiamos la edad");
        persona2.setEdad(16);
        System.out.println(persona2.getEdad());
    }

}
