import java.time.LocalDate;
import java.time.LocalTime;

class Dosis {
    private LocalDate fecha;
    private LocalTime hora;
    private Vacuna vacuna;

    public Dosis(Vacuna vacuna) {
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.vacuna = vacuna;
    }

    @Override
    public String toString() {
        return "Dosis [fecha=" + fecha + ", hora=" + hora + ", Vacuna: " + vacuna.nombre() + "]";
    }


  
}