package Herencia.Extras.RefugioDeAnimales;

import java.time.LocalDate;

abstract class Dosis {
    protected LocalDate fecha;

    public Dosis() {
        this.fecha = LocalDate.now();
    }



    
}
