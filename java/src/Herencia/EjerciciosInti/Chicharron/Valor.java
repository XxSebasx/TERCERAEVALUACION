package Herencia.EjerciciosInti.Chicharron;

public enum Valor {
    VALOR1(1),VALOR2(2),VALOR3(3),VALOR4(4),VALOR5(5);
    private int numero;

    private Valor(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    


}
