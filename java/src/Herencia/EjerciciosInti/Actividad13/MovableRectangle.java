package Herencia.EjerciciosInti.Actividad13;

public class MovableRectangle  implements Movable{
    private MovablePoint ezquinaIzquiera;
    private MovablePoint ezquinaDerecha;
    
    public MovableRectangle(int x, int y, int x2, int y2, int Speed) {
        this.ezquinaIzquiera = new MovablePoint(x2, y2, Speed, Speed);
        this.ezquinaDerecha = new MovablePoint(x2, y2, Speed, Speed);
    }

    @Override
    public void moveUp() {
        ezquinaDerecha.moveUp();
        ezquinaIzquiera.moveUp();
    }
    @Override
    public void moveDown() {
        ezquinaDerecha.moveDown();
        ezquinaIzquiera.moveDown();
    }
    @Override
    public void moveLeft() {
        ezquinaDerecha.moveLeft();
        ezquinaIzquiera.moveLeft();
    }
    @Override
    public void moveRight() {
        ezquinaDerecha.moveRight();
        ezquinaIzquiera.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle [ezquinaIzquiera=" + ezquinaIzquiera + ", ezquinaDerecha=" + ezquinaDerecha + "]";
    }

    

}
