package Herencia.EjerciciosInti.Actividad9;

public class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(){
        this(1.0);
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public String toString() {
        return "Un circulo con radio= " + radius + ", que es subclase de " + super.toString();
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    
    
}
