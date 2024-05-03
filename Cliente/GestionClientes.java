package Ficheros.Cliente;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GestionClientes {
    private Set<Cliente> clientes;

    public GestionClientes() {
        this.clientes = new TreeSet<>();
    }

    public void aniadirCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void modificarDatos(int id){
        Scanner entrada = new Scanner(System.in);
        for (Cliente cliente : clientes) {
            if(cliente.getId() == id){
                System.out.println("Modifique los nuevos datos (nombre,telefono)");
                String nombre = entrada.nextLine();
                String telefono = entrada.nextLine();
                cliente.setNombre(nombre);
                cliente.setNumeroTelefono(telefono);
            }
        }
    }

    public void darDeBaja(int id){
        for (Cliente cliente : clientes) {
            if(cliente.getId() == id){
                clientes.remove(cliente);
            }
        }
    }

    public void listarClientes(){
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public static void main(String[] args) {
        GestionClientes gestionClientes = new GestionClientes();
        Cliente cliente = new Cliente(3, null, null);
        gestionClientes.listarClientes();
        gestionClientes.darDeBaja(3);
        gestionClientes.listarClientes();
    }

    

    

}
