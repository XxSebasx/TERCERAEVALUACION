package Herencia.EjerciciosInti.ElectricaCadiz;

public enum Tramo {
    TRAMO1(5.0,0.00138),TRAMO2(7.0,0.00276),TRAMO3(9.0,0.01104);

    private double termninofijo;
    private double costokWh;

    private Tramo(double termninofijo, double costokWh) {
        this.termninofijo = termninofijo;
        this.costokWh = costokWh;
    }

    public double getTermninofijo() {
        return termninofijo;
    }

    public double getCostokWh() {
        return costokWh;
    }

    

    
}
