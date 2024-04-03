package ejercicio1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFileWithThrow {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("test.in"));
    }
}
