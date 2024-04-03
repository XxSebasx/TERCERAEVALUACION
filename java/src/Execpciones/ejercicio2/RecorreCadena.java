package ejercicio2;

public class RecorreCadena {
    public static void main(String[] args) {
        try {
            String cadena = "hola ¿Qué tal?";
            int posicion = 0;
            while (true) {
                System.out.println(cadena.charAt(posicion));
                posicion++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Fin de la cadena");
        }
    }
}
