package Herencia.EjerciciosInti.PIEDRAPAPELTIJERASENUM;

public enum Opciones {
   s("SCISSOR"),p("PAPER"),t("STONE");

    private String nombre;

    private Opciones(String nombre ){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    



  

    
}
