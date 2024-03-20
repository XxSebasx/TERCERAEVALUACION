package Herencia.Extras.RefugioDeAnimales;
import java.util.Comparator;

public class ComparadorFechas implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.fecha.equals(o2.fecha)) {
            if (o1 instanceof Perro && o2 instanceof Perro || o1 instanceof Gato && o2 instanceof Gato) {
                return o1.nombre.compareTo(o2.nombre);
            } else {
                if (o1 instanceof Gato) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            return o1.fecha.compareTo(o2.fecha);
        }
    }
}


