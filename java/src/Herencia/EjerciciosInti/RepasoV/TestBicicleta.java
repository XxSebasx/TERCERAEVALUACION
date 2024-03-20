package Herencia.EjerciciosInti.RepasoV;

public class TestBicicleta {
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta(10, 1, 2);
        Bicicleta tuBicicleta = new Bicicleta(15, 2, 5);
        miBicicleta.imprime();
        tuBicicleta.imprime();

        Bicicleta biciMontania = new BicicletaMontania(10, 2, 5, 9);
        Bicicleta biciTandem = new BicicletaTandem(30, 3, 8, 1);
        biciMontania.imprime();
        biciTandem.imprime();
        biciMontania.acelerar();
        biciTandem.acelerar();
        biciMontania.imprime();
        biciTandem.imprime();
       

        Bicicleta[] array = {miBicicleta,tuBicicleta,biciMontania,biciTandem};

        for (Bicicleta bicicleta : array) {
            bicicleta.acelerar();
        }

        miBicicleta.imprime();
        tuBicicleta.imprime();
        biciMontania.imprime();
        biciTandem.imprime();
        

     

    }
}
