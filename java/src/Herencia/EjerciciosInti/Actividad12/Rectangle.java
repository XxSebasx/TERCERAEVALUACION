package Herencia.EjerciciosInti.Actividad12;

public class Rectangle implements Shape {
    private double lenght;
    private double width;
    
    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }
    @Override
    public double getArea() {
        return lenght * width;
    }
    @Override
    public String toString() {
        return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
    }
}
