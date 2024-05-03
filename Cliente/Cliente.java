package Ficheros.Cliente;

import java.io.Serializable;

public class Cliente implements Comparable<Cliente>, Serializable {
    private int id;
    private String nombre;
    private String numeroTelefono;

    public Cliente(int id, String nombre, String numeroTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + numeroTelefono;
    }

    @Override
    public int compareTo(Cliente o) {
        return id-o.id;
    }

    

    
    
}
