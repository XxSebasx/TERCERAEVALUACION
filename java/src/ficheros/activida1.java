package ficheros;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class activida1 {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            String nombre = entrada.nextLine();
            File fic = new File(nombre);
            fic.createNewFile();
            System.out.println(fic.getName());
    
            System.out.println(fic.canRead());
            System.out.println(fic.canWrite());
    
            System.out.println(fic.getPath());
            System.out.println(fic.getAbsolutePath());
    
            System.out.println(fic.length());
            
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        
    }
    
}
