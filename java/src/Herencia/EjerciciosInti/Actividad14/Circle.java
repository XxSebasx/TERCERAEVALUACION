package Herencia.EjerciciosInti.Actividad14;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public double getArea() {
      return Math.PI*Math.pow(radius, 2);
    }
    
}
