package Herencia.EjerciciosInti.RadioStation;

abstract public class AudioElement {
    protected String name;

    public AudioElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void play();
    
    abstract public int duration();

    abstract public int profit();

    @Override
    public String toString() {
        return name;
    }

    
}