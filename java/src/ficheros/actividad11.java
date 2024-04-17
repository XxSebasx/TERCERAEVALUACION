package ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class actividad11 {
    public static void main(String[] args) {
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("double.dat"))) {
            Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
            double decimal = entrada.nextDouble();
            obj.writeDouble(decimal);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
