package ficheros;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class actividad2 {
    public static void main(String[] args) {
       try {
        Scanner entrada = new Scanner(System.in);
        File car = new File("Carp1");
        car.mkdir();
        int numero = entrada.nextInt();
        for (int i = 0; i <= numero; i++) {
            String nombreArchivo = entrada.nextLine();
            File fic = new File("Carp1",nombreArchivo);
            fic.createNewFile();
        }
        System.out.println(Arrays.toString(car.listFiles()));
        System.out.println(car.listFiles().length);
       } catch (IOException e) {
        e.printStackTrace();
       }
    }
}
