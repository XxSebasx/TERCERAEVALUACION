package Herencia.Extras.RefugioDeAnimales;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Perro extends Animal {

    private List<Dosis> historialVacunacion;

    
    public Perro(String nombre, String sexo, LocalDate fecha, int id) {
        super(nombre, sexo, fecha, id);
        this.historialVacunacion = new LinkedList<>();
    }


    @Override
    public String nombre() {
        return "Perro: " + nombre;
    }

    @Override
    public void administrarVacuna(Dosis dosis) {
        historialVacunacion.add(dosis);
    }
    
}
