package EJERCICIOSIII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class matricesExcepciones {
    public static void main(String[] args) {
        try{
        String[] months = {"January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October", 
        "November", "December"};
        int[] dom = {31,28,31,30,31,30,31,31,30,31,30,31};
        int usuario;
        Scanner entrada = new Scanner(System.in);
           
            usuario = entrada.nextInt();
            System.out.println(months[usuario-1] + " " + dom[usuario-1]);
           

        } catch (InputMismatchException e) {
            System.out.println("Introuce un entero");
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Numero incorrecto");
        }
        


    }
}
