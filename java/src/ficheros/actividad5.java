package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class actividad5 {
    public static void main(String[] args) {
        String nombreFcihero = "Datos.txt";
        BufferedWriter fic = null;
        try {
            fic = new BufferedWriter(new FileWriter(nombreFcihero));
            Scanner entrada = new Scanner(System.in);
            String nombre = entrada.nextLine();
            String edad = entrada.nextLine();
            fic.write("Nombre: " + nombre);
            fic.newLine();
            fic.write("Edad: " + edad);
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
