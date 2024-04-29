package Ficheros.Agenda;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;


public class Agenda {
    private Set<Contacto> contactos;

    public Agenda() {
        this.contactos = new TreeSet<>();
    }

    public void aniadirContacto(Contacto contacto){
        if(contactos.size() > 20){
            System.out.println("La agenda esta llena");
        }else if(contactos.contains(contacto)){
            System.out.println("Ese contacto ya existe");
        }else{
            contactos.add(contacto);
        }
    }

    public void buscarContactos(String palabrasClave){
        Set<String> numerosEncontrados = new HashSet<>();
        for (Contacto contacto : contactos) {
            if(contacto.getNombre().contains(palabrasClave)){
                numerosEncontrados.add(contacto.getNumero());
            }
        }

        for (String string : numerosEncontrados) {
            System.out.println(string);   
        }
    }

    public void mostrarContactos(){
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public Set<Contacto> getContactos() {
        return contactos;
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contacto contacto = new Contacto("sebas", "640249966");
        agenda.aniadirContacto(contacto);
        agenda.mostrarContactos();
    }
    


    

}
