package Herencia.EjerciciosInti.DiaDeLaSemana;

public class Dia {
    public static void determinarDia(DiaSemana dia){
        if(dia.esDiaSemana()){
            System.out.println(dia + " es dia de la semana");
        }else{
            System.out.println(dia + " es fin de semana");
        }
    }

    public static void main(String[] args) {
        for (DiaSemana dia : DiaSemana.values()) {
            determinarDia(dia);
        }

        System.out.println("------------------------------------");

        DiaSemana sabado = DiaSemana.SABADO;
        for (DiaSemana  dia : DiaSemana.values()) {
            int sol = dia.compareTo(sabado);
            if(sol < 0){
                System.out.println(dia + " antes de sabado");
            }else if(sol > 0){
                System.out.println(dia + " despues de sabado");
            }else{
                System.out.println(dia + " es Sabado");
            }
        }
    }
}
