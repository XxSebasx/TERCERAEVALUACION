package Herencia.EjerciciosInti.ElectricaCadiz;

public class ClienteSmart extends Cliente {
    private double porcentajeDescuento;
    public ClienteSmart(String dni, double potenciaContratada, double porcentajeDescuento) {
        super(dni, potenciaContratada);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double importeFacura(){
        double descuento =  super.importeFacura() * (porcentajeDescuento/100);
        return super.importeFacura() - descuento;
    }


    
}
