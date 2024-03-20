package Herencia.EjerciciosInti.Actividad9;

public class Square extends Rectangle {

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public Square(){
        super();
    }

    public double getSide(){
        return getLenght();
    }

    public void setSide(double side){
        this.setLenght(side);
    }

    @Override
    public String toString() {
        return "Un cuadrado con lado = " + this.getSide() + " Que es subclase de " + super.toString();
    }

    public void setWidth(double side){
        super.setLenght(side);
        super.setWidth(side);
    }

    public void setLenght(double side){
        this.setWidth(side);
    }

    public double getArea(){
        return this.getSide() * this.getSide();
    }

    public double getPerimeter(){
        return this.getSide() * 4;
    }

    

    public static void main(String[] args) {
        Square cuadrado = new Square(2);
        cuadrado.setSide(4);
        System.out.println(cuadrado);
    }

    
    
}
