package Herencia.EjerciciosInti.ElectricaCadiz;
import java.util.Set;
import java.util.HashSet;
public class Electrica {
    private Set<Cliente> clientes;

    public Electrica() {
        this.clientes = new HashSet<>();
    }

    public void agregarCliente(Cliente nuevoCliente){
        clientes.add(nuevoCliente);
    }

    public int getCantidadClientesPaneles(){
        int numeroClientesPaneles = 0;
       for (Cliente cliente : clientes) {
            if(cliente instanceof ClientePaneles){
                numeroClientesPaneles++;
            }
        }

        return numeroClientesPaneles;
    }

    public double getFacturacionTotal(){
        double facturaTotal = 0;
        for (Cliente cliente : clientes) {
            facturaTotal += cliente.importeFacura();
        }
        return facturaTotal;
    }


    
}
