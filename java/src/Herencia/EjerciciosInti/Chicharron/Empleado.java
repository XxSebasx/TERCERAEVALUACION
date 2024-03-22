package Herencia.EjerciciosInti.Chicharron;

public class Empleado extends Cliente {
    private int valor;
    final static int VALOR1 = 1;
    final static int VALOR2 = 2;
    final static int VALOR3 = 3;
    final static int VALOR4 = 4;
    final static int VALOR5 = 5;

   public Empleado(String nTarjeta, String nombre, int porcentajeBonificacion, int valor) {
        super(nTarjeta, nombre, porcentajeBonificacion);
        this.valor = valor;
    }

    @Override
    public void incSaldoAcumulado(double compra){
        int incremento = VALOR1;
        switch (this.valor) {
            case VALOR2:
                incremento = VALOR2;
                break;
            case VALOR3:
                incremento = VALOR3;
                break;
            case VALOR4:
                incremento = VALOR4;
                break;
            case VALOR5:
                incremento = VALOR5;
                break;
        
        }
        this.saldoAcumulado = this.saldoAcumulado + (compra+incremento/100) *(porcentajeBonificacion/100);
    }

    @Override
    public String toString() {
        return "Empleado [valor=" + valor + "]" + super.toString() + "]";
    }

    
}
    

