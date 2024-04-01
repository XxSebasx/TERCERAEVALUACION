package Herencia.EjerciciosInti.DiaDeLaSemana;

public enum DiaSemana {
    LUNES("Lunes"),MARTES("Martes"),MIERCOLES("Miercoles"),
    JUEVES("Jueves"),VIERNES("Viernes"),SABADO("Sabado"),
    DOMINGO("Domingo");

    private String nombre;

    private DiaSemana(String nombre) {
        this.nombre = nombre;
    }

    public boolean esDiaSemana(){
        return ordinal() < 5;
    }

    public boolean finDeSemana(){
        return !esDiaSemana();
    }

    @Override
    public String toString(){
        return nombre;
    }


    


    
}
