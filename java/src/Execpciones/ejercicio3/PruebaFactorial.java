package ejercicio3;

import java.util.Scanner;

public class PruebaFactorial {
    public static void main(String[] args) {
        String keepGoing = "Y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("Y") || keepGoing.equals("X")) {
            System.out.println("Enter an integer: ");
            try {
                int val = scan.nextInt();
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
                System.out.println("Another factorial? (y/n) ");
                keepGoing = scan.next();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }

        }
    }
}
