package Ficheros.CochesFicheros;

import java.io.Serializable;

public class Coche implements Serializable {
    private String matricula;
    private String marca;
    private String modelo;
    private double Cilindrada;

    public Coche(String matricula, String marca, String modelo, double cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        Cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCilindrada() {
        return Cilindrada;
    }

    @Override
    public String toString() {
        return "matricula: " + matricula + ", marca: " + marca + ", modelo: " + modelo + ", Cilindrada: "
                + Cilindrada;
    }

    

    

    
}
