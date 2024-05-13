package Examen.feisbu;

import java.util.Date;

//(genero-> m=mujer h=hombre o=otro)
public class Usuario {

    // Atributos
    // <Inserta tu código aquí>
    private String nombre;
    private String nombreCompleto;
    private String fechaRegistro;
    private char genero;

    // Constructores
    // <Inserta tu código aquí>
    public Usuario(String nombre, String nombreCompleto) {
        this(nombre, nombreCompleto, " ", ' ');
    }

    public Usuario(String nombre, String nombreCompleto, String fechaRegistro, char genero) {
        this.nombre = nombre;
        this.nombreCompleto = nombreCompleto;
        this.fechaRegistro = fechaRegistro;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public char getGenero() {
        return genero;
    }

    public boolean esAmigo(Usuario unUsuario) {
        // <Inserta tu código aquí>
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // método para obtener amigos

    // método para obtener grupos

    // método para agregar un amigo

    // método para agregar un grupo

    public Set<Usuario> amigosDeGenero(char genero) {
        // <Inserta tu código aquí>
    }

    // método toString

}