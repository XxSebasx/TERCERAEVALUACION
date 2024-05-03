package Ficheros.Cliente;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.Scanner;

public class ClienteMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestionClientes gestionClientes = new GestionClientes();
        File file = new File("cliente.dat");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
                    Cliente cliente = (Cliente) ois.readObject();
                    while (cliente != null) {
                        gestionClientes.aniadirCliente(cliente);
                        cliente = (Cliente)ois.readObject();
                    }

            } catch (EOFException | StreamCorruptedException e) {
            }catch(IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
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
                        System.out.println("Dime los datos del cliente (id nombre telefono)");
                        String[] atributos = entrada.nextLine().split(" ");
                        Cliente nuevoCliente = new Cliente(Integer.parseInt(atributos[0]), atributos[1], atributos[2]);
                        gestionClientes.aniadirCliente(nuevoCliente);
                        break;
                    case 2:
                        System.out.println("Dime el id del cliente a modificar");
                        int idModificar = entrada.nextInt();
                        gestionClientes.modificarDatos(idModificar);
                        break;
                    case 3:
                        System.out.println("Dime el id del cliente al que dar de baja");
                        int idEliminar = entrada.nextInt();
                        gestionClientes.darDeBaja(idEliminar);
                        try (ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(file))){
                            for (Cliente c : gestionClientes.getClientes()) {
                                oos.writeObject(c);
                            }
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        System.out.println("==========================");
                        gestionClientes.listarClientes();
                        System.out.println("==========================");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }    
}

