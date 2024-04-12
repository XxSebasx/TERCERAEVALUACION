import java.util.Comparator;
public class ComparadorFechas implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getFecha().equals(o2.getFecha())){
            if(o1 instanceof Gato && o2 instanceof Gato || o1 instanceof Perro && o2 instanceof Perro ){
                return o1.getNombre().compareTo(o2.getNombre());
            }else{
                if(o1 instanceof Gato){
                    return -1;
                }else{
                    return 1;
                }
            }
        }else{
            return o1.getFecha().compareTo(o2.getFecha());
        }
    }
    
}
