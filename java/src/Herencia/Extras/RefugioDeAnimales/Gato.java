package Herencia.Extras.RefugioDeAnimales;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Gato extends Animal {

    private List<Dosis> historialVacunacion;

    
    public Gato(String nombre, String sexo, LocalDate fecha, int id) {
        super(nombre, sexo, fecha, id);
        this.historialVacunacion = new LinkedList<>();
    }



    @Override
    public String nombre() {
        return "Gato: " + nombre;
    }



    @Override
    public void administrarVacuna(Dosis dosis) {
      historialVacunacion.add(dosis);
    }
    

}
