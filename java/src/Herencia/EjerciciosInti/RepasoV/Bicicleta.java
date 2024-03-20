package Herencia.EjerciciosInti.RepasoV;
public class Bicicleta extends Vehiculo {

    private int platoActual;
    private int pinionActual;

    public Bicicleta(int velocidadActual, int platoActual, int pinionActual) {
        super(velocidadActual);
        this.platoActual = platoActual;
        this.pinionActual = pinionActual;
    }

    public Bicicleta(){
        this(0, 1, 1);
    }

    

  



    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPinionActual() {
        return pinionActual;
    }

    public void setPinionActual(int pinionActual) {
        this.pinionActual = pinionActual;
    }


    public void cambiarPlato(int plato){
        this.platoActual = plato;
    }

    public void pinionActual(int pinion){
        this.pinionActual = pinion;
    }


    public void cambiarPlato(){
        this.platoActual = 1;
    }

    public void pinionActual(){
        this.pinionActual = 1;
    }

 
    @Override
    public void acelerar() {
        velocidadActual *= 2;
    }

    @Override
    public void frenar() {
        velocidadActual /=2;
    }

    @Override
    public void imprime() {
        System.out.println(getAtributos());
    }

    @Override
    public String getAtributos() {
        return "Bicicleta [velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pinionActual="
        + pinionActual + "]";
    }

    

  
}