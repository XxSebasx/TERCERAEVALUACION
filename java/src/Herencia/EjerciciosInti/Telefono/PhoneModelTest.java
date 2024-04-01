package Herencia.EjerciciosInti.Telefono;

import java.util.Scanner;

public class PhoneModelTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.err.println("Your budget: ");
        int precioUsuario = entrada.nextInt();
        int minimo = PhoneModel.LG.getPrecio();
        if(precioUsuario >= minimo){
            for (PhoneModel telefono : PhoneModel.values()) {
                if(telefono.getPrecio() <= precioUsuario){
                    System.out.println(telefono);
                }
            }
        }else{
            System.out.println("You do have sufficiente money");
        }

    }   
}
