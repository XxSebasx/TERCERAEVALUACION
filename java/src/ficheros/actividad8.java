package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class actividad8 {
    public static void main(String[] args) {
        String nombreFichero = "Numbers.txt";
        BufferedReader fic = null;
        try {
            fic = new BufferedReader(new FileReader(nombreFichero));

            String linea = fic.readLine();
            int mayor = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int lineas = 0;
            int suma = 0;
            while (linea != null) {
                lineas++;
                int numero = Integer.parseInt(linea);
                if(numero > mayor){
                    mayor = numero;
                }
                if(numero < menor){
                    menor = numero;
                }
                suma += numero;
                linea = fic.readLine();
            }

            System.out.println("El mayor es: " + mayor);
            System.out.println("El menor es: " + menor);
            System.out.println("La media es: " + suma/lineas);
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fic.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
