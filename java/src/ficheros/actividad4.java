package ficheros;

import java.io.FileReader;
import java.io.IOException;

public class actividad4 {
    public static void main(String[] args) {
        String Nombrefichero = "Clubes/Ese_Cadi_Oé.txt";
        FileReader fic = null;
        try {
            fic = new FileReader(Nombrefichero);
            int caracter = fic.read();
            while (caracter != -1) {
                System.out.print((char)caracter);
                caracter = fic.read();
            }
            
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
