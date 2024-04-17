package ficheros;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class actividad12 {

    public static void main(String[] args) {
        try (ObjectOutputStream bf = new ObjectOutputStream(new FileOutputStream("binario.dat"))){
            Scanner entrada = new Scanner(System.in);
            String frase = entrada.nextLine();
            bf.writeChars(frase);
            BufferedInputStream bfi = new BufferedInputStream(new FileInputStream("binario.dat"));
            int dato = bfi.read();
            while (dato != -1) {
                System.out.println((char)dato);
                dato = bfi.read();
            }
                  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
