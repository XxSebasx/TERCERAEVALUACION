import java.time.LocalDate;

public class Perro extends Animal {
    public Perro(String nombre, String sexo, LocalDate fecha, String id) {
        super(nombre, sexo, fecha, id);
    }

    @Override
    public String nombre() {
        return "Perro: " + nombre;
    }
    
}
