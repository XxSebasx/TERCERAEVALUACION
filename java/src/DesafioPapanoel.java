import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class DesafioPapanoel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            int tiempo = 0;
            Queue<Integer> cola = new LinkedList<>();
            int numeroNinos = entrada.nextInt();
            int posicionAitor = entrada.nextInt();
            entrada.nextLine();
            String[] regalos = entrada.nextLine().split(" ");
            
            int regalosAitor = Integer.parseInt(regalos[posicionAitor-1]);
            for (int j = 0; j < regalosAitor    ; j++) {
                if(regalosAitor == 0){
                    break;
                }

                cola.offer(j);
                cola.poll();
                
                
                
                for (String string : regalos) {
                    int entero = Integer.parseInt(string);
                    entero--;
                    tiempo += 2;
                }
                
            }
            System.out.println(tiempo);
        }
    }
}
