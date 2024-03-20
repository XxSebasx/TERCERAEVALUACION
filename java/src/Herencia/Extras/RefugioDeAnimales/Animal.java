package Herencia.Extras.RefugioDeAnimales;
import java.time.LocalDate;
import java.lang.Comparable;
abstract public class Animal implements Comparable <Animal> {
    protected String nombre;
    protected String sexo;
    protected LocalDate fecha;
    protected int id;

    
    public Animal(String nombre, String sexo, LocalDate fecha, int id) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fecha = fecha;
        this.id = id;
    }

    public Animal(){
        this("Paco", "Masculino", LocalDate.of(2024, 1, 7), 5);
    }


    abstract public String nombre();

    abstract public void administrarVacuna(Dosis dosis);

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (sexo == null) {
            if (other.sexo != null)
                return false;
        } else if (!sexo.equals(other.sexo))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Animal animal){
        if(this instanceof Perro && animal instanceof Perro || this instanceof Gato && animal instanceof Gato ){
            if(this.sexo.equals(animal.sexo)){
                return 0;
            }else{
                if(this.sexo.equals("Hembra")){
                    return 1;
                }else{
                    return -1;
                }
            }
        }else{
            if(this instanceof Gato){
                return 1;
            }else{
                return -1;
            }
        }
    }

    

}
