package Herencia.EjerciciosInti.RepasoV;
public class BicicletaTandem extends Bicicleta {
    private int numAsientos;

    public BicicletaTandem(int velocidadActual, int platoActual, int pinionActual,int numAsientos) {
        super(velocidadActual, platoActual, pinionActual);
        this.numAsientos = numAsientos;
    }

    @Override
    public void acelerar(){
        velocidadActual *= 4;
    }

 

    @Override
    public void imprime() {
        System.out.println(getAtributos());
    }

    @Override
    public String getAtributos() {
        return "BicicletaTandem [numAsientos=" + numAsientos+ " " + super.getAtributos() +"]";
    }

    
    
    
}
