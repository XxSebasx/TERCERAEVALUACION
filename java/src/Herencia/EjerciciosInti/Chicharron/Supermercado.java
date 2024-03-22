package Herencia.EjerciciosInti.Chicharron;
import java.util.HashSet;
import java.util.Set;
public class Supermercado {
    private Set<Cliente> clientes;

    public Supermercado() {
        this.clientes = new HashSet<>();
    }

    public Cliente annadirCliente(Cliente otroCliente){
        for (Cliente cliente : clientes) {
            if(cliente.equals(otroCliente)){
                return null;
            }
        }

        clientes.add(otroCliente);
        return otroCliente;
    }

    public Cliente annadirSaldo(String tarjeta, double compra){
        for (Cliente cliente : clientes) {
            if(cliente.getnTarjeta().equals(tarjeta)){
                cliente.incSaldoAcumulado(compra);
                return cliente;
            }
        }

        return null;
    }

    public double totalSaldoEmpleados(){
        int saldosAcumulados = 0;
        for (Cliente cliente : clientes) {
            if( cliente instanceof Empleado){
                saldosAcumulados += cliente.getSaldoAcumulado();
            }
        }

        return saldosAcumulados;
    }

    @Override
    public String toString() {
        return "Supermercado [clientes=" + clientes + "]";
    }

    

    

}
