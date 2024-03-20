package Herencia.Extras.RefugioDeAnimales;

import java.time.LocalDate;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Gato("Juana", "Hembra", LocalDate.now(), 1);
        Animal a2 = new Perro("Marco", "Macho", LocalDate.now(), 2);
    }
}
