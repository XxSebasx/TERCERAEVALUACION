import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
public abstract class Animal{
    protected String nombre;
    private String sexo;
    private LocalDate fecha;
    private String id;
    private Set<Dosis> dosis;

    
    public Animal(String nombre, String sexo, LocalDate fecha, String id) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fecha = fecha;
        this.id = id;
        this.dosis = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void aniadirDosis(Dosis dosis) {
        this.dosis.add(dosis);
    }

    public Set<Dosis> getDosis() {
        return dosis;
    }

    public abstract String nombre();


    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", sexo=" + sexo + ", fecha=" + fecha + ", id=" + id + ", dosis=" + dosis
                + "]";
    }


    

    
    
}