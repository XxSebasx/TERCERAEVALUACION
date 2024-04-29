package Ficheros.Cliente;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ClienteMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestionClientes gestionClientes = new GestionClientes();
        while (true) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.dat"))){
                    Cliente cliente = (Cliente) ois.readObject();
                    while (cliente != null) {
                        gestionClientes.aniadirCliente(cliente);
                        cliente = (Cliente)ois.readObject();
                    }

            } catch (EOFException e) {
            }catch(IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.dat"))){
                for (Cliente c : gestionClientes.getClientes()) {
                    oos.writeObject(c);
                }
                System.out.println("1.Añadir nuevo cliente");
                System.out.println("2.Modificar datos");
                System.out.println("3.Dar de baja cliente");
                System.out.println("4.Listar los clientes");
                int opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        String[] atributos = entrada.nextLine().split(" ");
                        Cliente nuevoCliente = new Cliente(Integer.parseInt(atributos[0]), atributos[1], atributos[2]);
                        gestionClientes.aniadirCliente(nuevoCliente);
                        break;
                    case 2:
                        System.out.println("Dime el id del cliente a modificar");
                        int id = entrada.nextInt();
                        gestionClientes.modificarDatos(id);
                        break;
                    case 3:
                        System.out.println("Dime el id del cliente al que dar de baja");
                        id = entrada.nextInt();
                        gestionClientes.darDeBaja(id);
                        break;
                    case 4:
                        gestionClientes.listarClientes();
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }    
}

