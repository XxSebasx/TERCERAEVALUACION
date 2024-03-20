package Herencia.EjerciciosInti.RadioStation;
import java.util.Random;
public class AudioTools {
    public static int getDuration(String nombreFichero){
        Random rdn = new Random();
        return rdn.nextInt(10)+1;
    }

    public static void nombrefichero(String audio){
        System.out.println("Reproduciendo: " + audio);
    }
}
