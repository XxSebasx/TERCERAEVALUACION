package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class actividad10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ruta = entrada.nextLine();
        
        try (BufferedInputStream bf = new BufferedInputStream(new FileInputStream(ruta)) ) {
            System.out.println(bf.available());

        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }
    }
}
