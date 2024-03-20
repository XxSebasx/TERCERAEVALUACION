package Herencia.EjerciciosInti.RepasoV;

abstract public class Vehiculo implements Imprimible{
    protected int velocidadActual;

    public Vehiculo(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    abstract public void acelerar();

    abstract public void frenar();
}
