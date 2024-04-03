package ejercicio2;

import java.util.Scanner;

public class ProcesarEnteros {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            String cadena = entrada.nextLine();
            int suma = 0;
        
            String[] listaNumeros = cadena.split(" ");
            for (String string : listaNumeros) {
                try {
                    suma += Integer.parseInt(string);
                } catch (Exception e) {
                    
                }
                
            }
            System.out.println(suma);
    }
}
