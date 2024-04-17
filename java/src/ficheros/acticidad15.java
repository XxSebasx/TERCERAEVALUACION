package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class acticidad15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ruta = entrada.nextLine();
        String fic1 = entrada.nextLine();
        String fic2 = entrada.nextLine();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(fic1));
            BufferedReader bf2 = new BufferedReader(new FileReader(fic1));
            String nombre = fic1+"_"+fic2;
            File file = new File(ruta,nombre);
            BufferedWriter bfw = new BufferedWriter(new FileWriter(nombre));
            
            
        } catch (IOException e) {
            
        }
    }
}
