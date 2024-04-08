package Herencia.EjerciciosInti.PIEDRAPAPELTIJERASENUM;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rdn = new Random();
        int empate = 0;
        int ganadas = 0;
        int perdidas = 0;
        int partidas = 0;
        while (true) {
            System.out.println("Scissor-Paper-Stone");
            System.out.println("You turn (Enter s for scissor, p for paper, t for stone, q to quit)");
            String jugador = entrada.nextLine().toLowerCase();
            if(jugador.equals("q")){
                break;
            }
            partidas++;
            Opciones opcionjugador = Opciones.valueOf(jugador);
            Opciones opcionmaquina = null;
            int maquina = rdn.nextInt(3);
            switch (maquina) {
                case 0:
                    opcionmaquina = Opciones.s;
                    break;
                case 1:
                    opcionmaquina = Opciones.p;
                    break;
                case 2:
                    opcionmaquina = Opciones.t;
                    break;
            }

            System.out.println(opcionmaquina.getNombre());

            if(opcionjugador == opcionmaquina){
                empate++;
                System.out.println("Empatamos colega");
            }else{
                switch (opcionjugador.getNombre()) {
                    case "SCISSOR":
                        if(opcionmaquina == Opciones.p){
                            ganadas++;
                            System.out.println("You Won!");
                        }else{
                            perdidas++;
                            System.out.println("I Won!");
                        }
                        break;
                    case "PAPER":
                        if(opcionmaquina == Opciones.t){
                            ganadas++;
                            System.out.println("You Won!");
                        }else{
                            perdidas++;
                            System.out.println("I Won!");
                        }
                        break;
                    case "STONE":
                        if(opcionmaquina == Opciones.s){
                            ganadas++;
                            System.out.println("You Won!");
                        }else{
                            perdidas++;
                            System.out.println("I Won!");
                        }
                        break;
                }
            }

        }

        System.out.println("Number of trials: " + partidas);
        System.out.println("I won " + perdidas +" ." + " You won " + ganadas + " .");
        System.out.println("Empate " + empate);
        System.out.println("Bye!");
    }
}
