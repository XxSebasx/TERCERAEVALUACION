import java.time.LocalDate;
public class Gato extends Animal {
   

    public Gato(String nombre, String sexo, LocalDate fecha, String id) {
        super(nombre, sexo, fecha, id);
    }

    @Override
    public String nombre() {
        return "Gato: " + nombre;
    }

 
}
