import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PruebaRefugio {
    public static void main(String[] args) throws InterruptedException {
        Refugio refugio = new Refugio();

        // Entra el gato Juana
        refugio.aniadirAnimal(new Gato("Juana", "hembra", LocalDate.now(), "01"));

        // Entra el perro Marco
        refugio.aniadirAnimal(new Perro("Marco", "macho", LocalDate.now(), "02"));

        // Entra el perro Lassie
        refugio.aniadirAnimal(new Perro("Lassie", "hembra", LocalDate.now(), "03"));

        // Entra el gato Carlos
        refugio.aniadirAnimal(new Gato("Carlos", "macho", LocalDate.now(), "04"));

        // Entra el gato Lola
        refugio.aniadirAnimal(new Gato("Lola", "hembra", LocalDate.now(), "05"));

        // Entra el perro Canela
        refugio.aniadirAnimal(new Perro("Canela", "hembra", LocalDate.now(), "06"));

        // Entra el perro Snoopy
        refugio.aniadirAnimal(new Perro("Snoopy", "macho", LocalDate.now(), "07"));

        // Entra el gato Felix
        refugio.aniadirAnimal(new Gato("Felix", "macho", LocalDate.now(), "08"));

        // Se adopta un gato y se muestra su nombre
        refugio.adoptarGato();

        // Se adopta un gato y se muestra su nombre
        refugio.adoptarGato();

        // Se adopta un gato y se muestra su nombre
        refugio.adoptarGato();

        // Se adopta un perro y se muestra su nombre
        refugio.adoptarPerro();

        // Entra el perro Pluto
        refugio.aniadirAnimal(new Perro("Pluto", "macho", LocalDate.now(), "09"));

        // Entra el gato Garfield
        refugio.aniadirAnimal(new Gato("Garfield", "macho", LocalDate.now(), "10"));

        // Muestra el animal más antiguo.
        refugio.listarPorFecha();

        // Se detiene la ejecución un minuto para simular el paso del tiempo
        TimeUnit.MINUTES.sleep(1);

        // Debido a una crisis sanitaria se suministra una dosis, al perro Pluto, de la vacuna contra el Coronavirus
        refugio.suministrarDosis(new Perro("Pluto", "macho", LocalDate.now(), "09"), VacunaPerro.CCORONAVIRUS);

        // Debido a una crisis sanitaria se suministra una dosis, al gato Garfield, de la vacuna contra el Coronavirus
        refugio.suministrarDosis(new Gato("Garfield", "macho", LocalDate.now(), "10"), VacunaGatos.FCORONAVIRUS);

        // Se muestra el historial de vacunación del gato Garfield
        for (Animal animal : refugio.getAnimales()) {
            if (animal.getNombre().equals("Garfield")) {
                System.out.println("Historial de vacunación de Garfield:");
                for (Dosis dosis : animal.getDosis()) {
                    System.out.println(dosis);
                }
                break;
            }
        }

        // Se adoptan todos los animales que quedan y se muestra el nombre de cada uno.
        for (Animal animal : refugio.getAnimales()) {
            if (animal instanceof Gato) {
                refugio.adoptarGato();
            } else if (animal instanceof Perro) {
                refugio.adoptarPerro();
            }
        }

        // Lista por pantalla de todos los animales que han pasado por el refugio ordenados por especie y sexo
        System.out.println("Animales que han pasado por el refugio ordenados por especie y sexo:");
        refugio.listarPorEspecie();

        // Lista por pantalla todos los animales que han sido adoptados ordenados por fecha de adopción y especie
        System.out.println("Animales adoptados ordenados por fecha de adopción y especie:");
        refugio.listarPorFecha();
    }
}
