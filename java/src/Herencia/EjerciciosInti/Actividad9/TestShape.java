package Herencia.EjerciciosInti.Actividad9;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);    
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        /*En este metodo se produce un error de compilacion ya que
         * Hemos declarado el objeto como figura y aunque hayamos
         * usado el constructor Circle una figura no tiene porque tener
         * radio por lo que es un metodo exclusivo de circulo
         */
        // System.out.println(s1.getRadius()); 

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        /*No se puede instanciar una clase abstracta
         * ya que son clases hechas para ser extendidas
         */
        // Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "RED",false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        /**
         * En este metodo se produce un error de compilacion ya que
         * Hemos declarado el objeto como figura y aunque hayamos
         * usado el constructor Rectangle una figura no tiene porque tener
         * altura por lo que es un metodo exclusivo de rectangulo
         */
        // System.out.println(s3.getLenght());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        /**
         * En este metodo se produce un error de compilacion ya que
         * Hemos declarado el objeto como figura y aunque hayamos
         * usado el constructor Square una figura no tiene porque medir
         * todos sus lados los mismo por lo que es un metodo exclusivo 
         * de cuadrado
         */
        // System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
          /**
         * En este metodo se produce un error de compilacion ya que
         * Hemos declarado el objeto como Rectangle y aunque hayamos
         * convertido el cuadrado en un rectangulo un rectangulo no tiene
         * todos sus lados iguales por lo que es un metodo exclusivo 
         * de Rectangulo
         */
        // System.out.println(r2.getSide());
        System.out.println(r2.getLenght());

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLenght());
    }
   
    
}
