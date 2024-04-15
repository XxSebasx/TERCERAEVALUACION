package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class actividad7 {
    public static void main(String[] args) {
        String nombreArchivo = "Clubes/Musho_Beti_Eh.txt";
        BufferedReader fic = null;
        try {
            fic = new BufferedReader(new FileReader(nombreArchivo));
            String linea = fic.readLine();
            int lineas = 0;
            int nCaracteres = 0;
            int nPalabras = 0;
            while (linea != null){
                lineas++;
                nCaracteres += linea.length();
                String[] palabras = linea.split(" ");
                nPalabras += palabras.length;
                linea = fic.readLine();   
            }

            System.out.println("Caracteres: " + nCaracteres);
            System.out.println("palabras: " + nPalabras);
            System.out.println("Lineas: " + lineas);
            
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
