package Herencia.EjerciciosInti.RepasoV;
public class BicicletaMontania extends Bicicleta {
    private int suspension;
    
    public BicicletaMontania(int velocidadActual, int platoActual, int pinionActual,int suspension) {
        super(velocidadActual, platoActual, pinionActual);
        this.suspension = suspension;
    }


    public void cambiarSuspension(int suspension){
        this.suspension = suspension;
    }

    @Override
    public void acelerar(){
        velocidadActual *= 3;
    }




    @Override
    public void imprime() {
        System.out.println(getAtributos());
    }

    @Override
    public String getAtributos() {
        return "BicicletaMontania [suspension=" + suspension + " "+ super.getAtributos() +"]";
    }

    
}
