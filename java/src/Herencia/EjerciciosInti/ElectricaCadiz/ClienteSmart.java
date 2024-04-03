package Herencia.EjerciciosInti.ElectricaCadiz;

public class ClienteSmart extends Cliente {
    private double porcentajeDescuento;
    public ClienteSmart(String dni, double potenciaContratada, double porcentajeDescuento) {
        super(dni, potenciaContratada);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double importeFacura(){
        double imp = super.importeFacura();
        double descuento =  imp * (porcentajeDescuento/100);
        return imp - descuento;
    }

    @Override
    public String toString() {
        return "ClienteSmart [" + super.toString() + "porcentajeDescuento=" + porcentajeDescuento + "]";
    }

    


    
}
