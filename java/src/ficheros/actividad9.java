package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class actividad9 {
    public static void main(String[] args) {
        String nombreArchivo = "Firmas.txt";
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try {
            bfr = new BufferedReader(new FileReader(nombreArchivo));
            bfw = new BufferedWriter(new FileWriter(nombreArchivo,true));
            Scanner entrada = new Scanner(System.in);
            System.out.println("1.Mostrar firmar");
            System.out.println("2. Insertar nombre");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    String linea = bfr.readLine();
                    while (linea != null) {
                        System.out.println(linea);
                        linea = bfr.readLine();
                    }
                    break;
            
                case 2:
                    String nombre = entrada.nextLine();
                    bfw.newLine();
                    bfw.write(nombre);
                    break;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                bfr.close();
                bfw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
