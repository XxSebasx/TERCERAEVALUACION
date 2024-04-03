package Herencia.EjerciciosInti.ElectricaCadiz;

public class ClientePaneles extends Cliente{

    private double energiaInyectada;
    private double contadorEnergiaInyectada;

    public ClientePaneles(String dni, double potenciaContratada) {
        super(dni, potenciaContratada);
        energiaInyectada = 0;
        contadorEnergiaInyectada = 0;
    }

    public void actualizaEnergiaInyectada(double nuevaLecturaContador){
        this.energiaInyectada = nuevaLecturaContador - contadorEnergiaInyectada; 
        contadorEnergiaInyectada = nuevaLecturaContador;
    }

    @Override
    public double importeFacura(){
        return super.importeFacura() - (energiaInyectada * 0.0034);
    }
    
  
}
