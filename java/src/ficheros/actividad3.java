package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class actividad3 {
    public static void main(String[] args) {
        try {
            File car = new File("Clubes");
            String[] listado = car.list();
            System.out.println(Arrays.toString(listado));
            System.out.println(car.length());
            Long mayor = new Long(0);
            String nombreArchivoMayor = "";
            for (String fichero : listado) {
                File fic = new File("Clubes", fichero);
                if(fic.length() > mayor){
                    mayor = fic.length();
                    nombreArchivoMayor = fichero;
                }
            }

            System.out.println(nombreArchivoMayor + mayor);
            

                        

        } catch (Exception e) {
            
        }
    }
}
