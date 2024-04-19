package Ficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CombinadorFicheros {

    public static void unirFicheros(String ruta, String fic1, String fic2){
        Scanner entrada = new Scanner(System.in);
        String nombre = fic1+"_"+fic2;
        File file = new File(ruta,nombre);
        char opcion = 's';
            try (BufferedReader bf = new BufferedReader(new FileReader(fic1));
            BufferedReader bf2 = new BufferedReader(new FileReader(fic2));
            BufferedWriter bfw = new BufferedWriter(new FileWriter(file));){
                if(file.exists()){
                    System.out.println("El fichero " + nombre + " en la ruta " + ruta + " ya existe");
                    System.out.println("DESEA SOBREESCRIBIR?(s/n)");
                    opcion = entrada.nextLine().charAt(0);
                }

                if(opcion != 'n'){
                    String linea1 = bf.readLine();
                    String linea2 = bf2.readLine();

                    while (linea1 != null) {
                        bfw.write(linea1);
                        linea1 = bf.readLine();
                    }

                    while (linea2 != null) {
                        bfw.write(linea2);
                        linea2 = bf2.readLine();
                    }
                }
            
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        
       

    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ruta = entrada.nextLine();
        String fic1 = entrada.nextLine();
        String fic2 = entrada.nextLine();
        CombinadorFicheros.unirFicheros(ruta, fic1, fic2);

        


    }
}
