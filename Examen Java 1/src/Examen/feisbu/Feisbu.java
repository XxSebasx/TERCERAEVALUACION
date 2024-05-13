public class Feisbu {

    //<Inserta tu código aquí>

    public Feisbu() {
        //<Inserta tu código aquí>

        cargaUsuariosGrupos();
        cargaRelacionesAmistad();
    }
    

    /**
     * Lee por la entrada estandar lineas de datos que contienen
     * cada una información de un usuario de la red social Feisbu
     */
    //método cargaUsuariosGrupos(){
        //<Inserta tu código aquí>
    //}

    /**
     * Lee por la entrada estandar lineas de datos que contienen
     * cada una las relaciones de amistad de cada usuario de la red 
     * social Feisbu
     */

    //métodocargaRelacionesAmistad(){    
        //<Inserta tu código aquí>
    //}
    
    /**
     * Devuelve un objeto LocalDate que se corresponde con el 
     * anio, mes y dia pasados como parámetro
     */
    private LocalDate getFecha(String anio, String mes, String dia){
        int d = Integer.parseInt(dia);
        int m = Integer.parseInt(mes);
        int a = Integer.parseInt(anio);
        return LocalDate.of(a,m,d);
    }

    /**
     * Devuelve el objeto Usuario que tiene el en nombre de usuario
     * pasado como parámetro. Si no lo encuentra devulve null;
     */
    public Usuario buscaUsuario(String nombreUsuario){
        return usuarios.get(nombreUsuario);
    }

    /**
     * Devuelve el objeto Grupo que tiene en nombre de grupo
     * pasado como parámetro. Si no lo encuentra devulve null;
     */
    public Grupo buscaGrupo(String nombreGrupo){
        return grupos.get(nombreGrupo);
    }
    
    /**
     * Agrega un usuario en la estructura de datos que mantiene la red
     * social para usuarios 
     */
    public Usuario agregaUsuario(Usuario unUsuario){
       // <Inserta tu código aquí>
    }

    /**
     * Agrega un grupo en la estructura de datos que mantiene la red
     * social para grupos 
     */
    public Grupo agregaGrupo(Grupo unGrupo){
         //<Inserta tu código aquí>
    }

    /**
     * Devuelve todos los usuarios de la red social
     */
    public Set<Usuario> getUsuarios(){
       //<Inserta tu código aquí>
    }
    
    /**
     * Devuelve todos los grupos de la red social
     */
    public Set<Grupo> getGrupos(){
        //<Inserta tu código aquí>
    }

    /**
     * Devuelve un mapa ordenado por grupo alfabéticamente 
     * para cada grupo se asocia un conjunto de objetos usuario 
     * de de ese grupo de genero 'm' ordenado alfabéticamente por nombreCompleto
     */
    //método usuariosMujerGrupos(){
        //<Inserta tu código aquí>
    //}
    
    public static void main(String[] args) {
        //<Inserta tu código aquí>
    }
}
