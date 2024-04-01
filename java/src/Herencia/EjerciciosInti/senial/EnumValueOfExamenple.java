package Herencia.EjerciciosInti.senial;

public class EnumValueOfExamenple {
    public static void main(String[] args) {
        TrafficSignal signal = TrafficSignal.valueOf("RED");
        System.out.println("name : " + signal.name() + " action : " + signal.getAction());
        
        signal = TrafficSignal.valueOf("GREEN");
        System.out.println("name : " + signal.name() + " action : " + signal.getAction());

        signal = TrafficSignal.valueOf("Green");
    }
    
}
