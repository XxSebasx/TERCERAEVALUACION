package ficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class actividad6 {
    public static void main(String[] args) {
        String nombreArchivoLeer = "Clubes/Forza_Xerez.txt";
        String nombreArchivoCopia = "Copia_Forza_Xerez.txt";
        BufferedReader fic = null;
        BufferedWriter fic2 = null;

        try {
            fic = new BufferedReader(new FileReader(nombreArchivoLeer));
            fic2 = new BufferedWriter(new FileWriter(nombreArchivoCopia));

            String linea = fic.readLine();

            while (linea != null) {
                fic2.write(linea);
                fic2.newLine();
                linea = fic.readLine();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fic.close();
                fic2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
