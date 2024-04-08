package EJERCICIOSII;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcProb {
    public static void main(String[] args) {
        int num = 20;
        try {
            Scanner inFile = new Scanner(new File("C:\\Users\\moust\\OneDrive\\Escritorio\\TERCERAEVALUACION\\java\\src\\data"));
            while (inFile.hasNext()) {
                int inVal = inFile.nextInt();
                num = num + inVal;
                System.out.println("Sansa");
            }
        } catch (InputMismatchException exc) {
            System.out.println("Problem with file");
        } catch(FileNotFoundException exc){
            System.out.println("File not found");
        }

        System.out.println("Answer: " + num);
    }

    /*
     * Para que el programa imprima el mensaje de error "Prblem with file", 
     * necesitamos un archivo de datos que contenga algún valor que no sea un entero
     */
}
