package Herencia.EjerciciosInti.ElectricaCadiz;

public class Cliente {
    protected String dni;
    protected double contadorEnergia;
    protected double energiaConsumida;
    protected double potenciaContratada;

    public Cliente(String dni, double potenciaContratada) {
        this.dni = dni;
        this.potenciaContratada = potenciaContratada;
        energiaConsumida = 0.0;
        contadorEnergia = 0.0;
    }

    public void actualizaEnergiaConsumida(double nuevaLecturaContador){
       this.energiaConsumida = nuevaLecturaContador - contadorEnergia; 
       contadorEnergia = nuevaLecturaContador;
    }

    public double importeFacura(){
        double terminoFijo = 0;
        double costokWh = 0;
        if(potenciaContratada < 3.4){
            terminoFijo = Tramo.TRAMO1.getTermninofijo();
            costokWh =  Tramo.TRAMO1.getCostokWh();
        }else if(potenciaContratada <= 3.4 && potenciaContratada <= 6.4){
            terminoFijo = Tramo.TRAMO2.getTermninofijo();
            costokWh =  Tramo.TRAMO2.getCostokWh();
        }else{
            terminoFijo = Tramo.TRAMO3.getTermninofijo();
            costokWh =  Tramo.TRAMO3.getCostokWh();
        }

        return terminoFijo + energiaConsumida * costokWh;
    }



    
}
