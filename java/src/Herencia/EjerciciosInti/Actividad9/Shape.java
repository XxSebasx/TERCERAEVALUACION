package Herencia.EjerciciosInti.Actividad9;

abstract public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(){
        this("red", true);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    @Override
    public String toString() {
        String rellena = "rellena";
        if(!this.filled){
            rellena = "no rellena";
        }
        return "Una figura de color " + color + " " + rellena;
    }

 
    
    
    
}
