package Herencia.EjerciciosInti.Actividad14;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius){
        super(radius);
    }

    public ResizableCircle(){
        super();
    }


    @Override
    public void resize(int percent) {
        radius += (percent * radius/100);
    }

    @Override
    public String toString() {
        return "ResizableCircle []";
    }
    
}
