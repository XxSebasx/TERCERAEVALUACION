package Herencia.EjerciciosInti.senial;

public enum TrafficSignal {
    RED("stop"), GREEN("start"), ORANGE("slow down");
    
    private String action;
    
    public String getAction() {
        return action;
    }

    private TrafficSignal(String action) {
        this.action = action;
    }
    
    
}
