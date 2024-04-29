package Ficheros.Agenda;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AgendaMain {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner entrada = new Scanner(System.in);
        Boolean menu = true;
        try (BufferedReader bdr = new BufferedReader(new FileReader("agenda.txt"));){
            String linea = bdr.readLine();
            while (linea != null) {
                String [] atributos = linea.split(":");
                Contacto contacto = new Contacto(atributos[0], atributos[1]);
                agenda.aniadirContacto(contacto);
                linea = bdr.readLine();
            }

            while (menu) {
                System.out.println("1.Nuevo contacto");
                System.out.println("2.Bucar por nombre");
                System.out.println("3.Mostrar todos");
                System.out.println("4.salir");

                int opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el nombre y el telefono");
                        String[] nuevoContacto = entrada.nextLine().split(" ");
                        Contacto contact = new Contacto(nuevoContacto[0], nuevoContacto[1]);
                        agenda.aniadirContacto(contact);
                        System.out.println(agenda.getContactos());
                        break;
                
                    case 2:
                        String palabrasClave = entrada.nextLine();
                        agenda.buscarContactos(palabrasClave);
                        break;
                    case 3:
                        agenda.mostrarContactos();
                        break;
                    case 4:
                        menu = false;
                        break;
                }

            }
            
            try  (BufferedWriter bdw = new BufferedWriter(new FileWriter("agenda.txt"))){
                for (Contacto contacto : agenda.getContactos()) {
                    bdw.write(contacto.toString());
                    bdw.newLine();
                }
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
