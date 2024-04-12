import java.util.Comparator;
public class ComparadorEspecies implements Comparator <Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1 instanceof Gato && o2 instanceof Gato || o1 instanceof Perro && o2 instanceof Perro ){
            if(o1.getSexo().equals(o2.getSexo())){
                return 0;
            }else{
                if(o1.getSexo().equals("hembra")){
                    return -1;
                }else{
                    return 1;
                }
            }
        }else{
            if(o1 instanceof Gato){
                return -1;
            }else{
                return 1;
            }
        }
    }
    
}
