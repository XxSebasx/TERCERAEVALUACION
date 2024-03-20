package Herencia.EjerciciosInti.Actividad9;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;

    public Rectangle(double width, double lenght) {
        super();
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.lenght = lenght;
    }


    public Rectangle() {
        this(1.0, 1.0);
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }



    @Override
    public String toString() {
        return "Un rectangulo con ancho= " + width +  " y longitud= " + lenght + ", que es subclase de " + super.toString();
    }

    public double getArea(){
        return width * lenght;
    }

    public double getPerimeter(){
        return (width * 2) + (lenght * 2);
    }

    

    

    
    
    
}
