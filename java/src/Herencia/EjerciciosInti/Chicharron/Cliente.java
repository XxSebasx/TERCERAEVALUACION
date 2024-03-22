package Herencia.EjerciciosInti.Chicharron;

public class Cliente {
    protected String nTarjeta;
    protected String nombre;
    protected double saldoAcumulado;
    protected int porcentajeBonificacion;

    public Cliente(String nTarjeta, String nombre, int porcentajeBonificacion) {
        this.nTarjeta = nTarjeta;
        this.nombre = nombre;
        this.porcentajeBonificacion = porcentajeBonificacion;
        this.saldoAcumulado = 0.0;
    }

    public void resetSaldo(){
        this.saldoAcumulado = 0.0;
    }

    public void incSaldoAcumulado(double compra){
        this.saldoAcumulado += compra *(porcentajeBonificacion/100);
    }

    public String getnTarjeta() {
        return nTarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    public int getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nTarjeta == null) ? 0 : nTarjeta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (nTarjeta == null) {
            if (other.nTarjeta != null)
                return false;
        } else if (!nTarjeta.equals(other.nTarjeta))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cliente [nTarjeta=" + nTarjeta + ", nombre=" + nombre + ", saldoAcumulado=" + saldoAcumulado
                + ", porcentajeBonificacion=" + porcentajeBonificacion + "]";
    }

    



    



    
}
