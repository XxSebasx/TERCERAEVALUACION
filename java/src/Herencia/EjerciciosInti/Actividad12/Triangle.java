package Herencia.EjerciciosInti.Actividad12;

public class Triangle implements Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
    @Override
    public double getArea() {
       return (base*height)/2;
    }
}
