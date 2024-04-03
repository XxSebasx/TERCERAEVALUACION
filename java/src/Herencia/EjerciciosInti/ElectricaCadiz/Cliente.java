package Herencia.EjerciciosInti.ElectricaCadiz;

public class Cliente {
    private String dni;
    private double contadorEnergia;
    private double energiaConsumida;
    private double potenciaContratada;

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
        }else if(potenciaContratada >= 3.4 && potenciaContratada <= 6.4){
            terminoFijo = Tramo.TRAMO2.getTermninofijo();
            costokWh =  Tramo.TRAMO2.getCostokWh();
        }else{
            terminoFijo = Tramo.TRAMO3.getTermninofijo();
            costokWh =  Tramo.TRAMO3.getCostokWh();
        }

        return terminoFijo + energiaConsumida * costokWh;
    }

    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", contadorEnergia=" + contadorEnergia + ", energiaConsumida=" + energiaConsumida
                + ", potenciaContratada=" + potenciaContratada + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    

    



    
}
