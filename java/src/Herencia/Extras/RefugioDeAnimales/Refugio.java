package Herencia.Extras.RefugioDeAnimales;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class Refugio {
    List <Animal> animales;

    public Refugio() {
        animales = new LinkedList<>();
    }

    public void entraAnimal(Animal animal){
        animales.add(animal);
    }

    public void adoptarAnimal(){
        animales.remove(0);
    }

    public void adoptarPerro(){
       Iterator<Animal> it = animales.iterator();
       while (it.hasNext()) {
            Animal animal = it.next();
            if(animal instanceof Perro){
                it.remove();
                break;
            }
       }
    }

    public void adoptarGato(){
        Iterator<Animal> it = animales.iterator();
        while (it.hasNext()) {
             Animal animal = it.next();
             if(animal instanceof Gato){
                 it.remove();
                 break;
             }
        }
    }

    public Animal animalMasAntiguo(){
        return animales.get(0);
    }

    public Animal perroMasAntiguo(){
        for (Animal animal : animales) {
            if(animal instanceof Perro){
                return animal;
            }
        }
        return null;
    }

    public Animal gatoMasAntiguo(){
        for (Animal animal : animales) {
            if(animal instanceof Gato){
                return animal;
            }
        }
        return null;
    }

    public void vacunarAnima(Animal otroAnimal, Dosis dosis){
        for (Animal animal : animales) {
            if(animal.equals(otroAnimal)){
                animal.administrarVacuna(dosis);
            }
        }
    }

    public void listadoEspecie(){
        List<Animal> ordenadoEspecie = this.animales;
        Collections.sort(ordenadoEspecie);
        for (Animal animal : ordenadoEspecie) {
            System.out.println(animal.nombre());
        }
    }

    public void listadoFecha(){
        List<Animal> ordenadoFecha = this.animales;
        Collections.sort( ordenadoFecha, new ComparadorFechas());
        for (Animal animal : ordenadoFecha) {
            System.out.println(animal.nombre());
        }
    }

    

    
}
