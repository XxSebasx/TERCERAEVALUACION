package Ficheros.AparcaBicis;
import java.lang.Comparable;
public class AparcaBicicleta implements Comparable<AparcaBicicleta> {
    private double x;
    private double y;
    private int id;
    private String barrios;
    private int aros;
    private boolean instalado;

    public AparcaBicicleta(double x, double y, int id, String barrios, int aros, boolean instalado) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.barrios = barrios;
        this.aros = aros;
        this.instalado = instalado;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getId() {
        return id;
    }

    public String getBarrios() {
        return barrios;
    }

    public int getAros() {
        return aros;
    }

    public boolean isInstalado() {
        return instalado;
    }

    @Override
    public String toString() {
        return "AparcaBicicleta [x=" + x + ", y=" + y + ", id=" + id + ", barrios=" + barrios + ", aros=" + aros
                + ", instalado=" + instalado + "]";
    }

    @Override
    public int compareTo(AparcaBicicleta o) {
        return id-o.id;
    }

    

    

    
}
