import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


public class Refugio {
    private Set<Animal> animales;

    public Refugio() {
        this.animales = new HashSet<>();
    }

    

    public void aniadirAnimal(Animal animal){
        if(animal instanceof Perro){
            for (VacunaPerro vacunaPerro : VacunaPerro.values()) {
                if(vacunaPerro.esEsencial()){
                    Dosis dosis = new Dosis(vacunaPerro);
                    animal.aniadirDosis(dosis);
                }
            }
        }else{
            for (VacunaGatos vacuna : VacunaGatos.values()) {
                if(vacuna.esEsencial()){
                    Dosis dosis = new Dosis(vacuna);
                    animal.aniadirDosis(dosis);
                }      
            }   
        }
        animales.add(animal);
        

    }

    public void adoptarAnimal(){
        List<Animal> ordenFecha = new LinkedList<>(animales);
        Collections.sort(ordenFecha, new ComparadorFechas());
        ordenFecha.remove(0);
    }

    public void adoptarPerro(){
        List<Animal> ordenFecha = new LinkedList<>(animales);
        Collections.sort(ordenFecha, new ComparadorFechas());
        for (Animal animal : ordenFecha) {
            if(animal instanceof Perro){
                animales.remove(animal);
            }
        }
    }

    public void adoptarGato(){
        List<Animal> ordenFecha = new LinkedList<>(animales);
        Collections.sort(ordenFecha, new ComparadorFechas());
        for (Animal animal : ordenFecha) {
            if(animal instanceof Gato){
                animales.remove(animal);
            }
        }
    }

    public void suministrarDosis(Animal animal,Vacuna vacuna){
        for (Animal a : animales) {
            if(animal.equals(a)){
                Dosis dosis = new Dosis(vacuna);
                animal.aniadirDosis(dosis);
                break;
            }
        }
    }

    public void listarPorEspecie(){
        List<Animal> ordenEspecie = new LinkedList<>(animales);
        Collections.sort(ordenEspecie, new ComparadorEspecies());
        for (Animal animal : ordenEspecie) {
            System.out.println(animal); 
        }  
    }

    public void listarPorFecha(){
        List<Animal> ordenEspecie = new LinkedList<>(animales);
        Collections.sort(ordenEspecie, new ComparadorFechas());
        for (Animal animal : ordenEspecie) {
            System.out.println(animal);
        }  
    }

    public Set<Animal> getAnimales() {
        return animales;
    }




    
}
