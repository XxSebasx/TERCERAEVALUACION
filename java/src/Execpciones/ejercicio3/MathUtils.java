package ejercicio3;

public interface MathUtils {
    public static int factorial(int n) throws IllegalArgumentException{
        int fac = 1;
        if(n < 0 || n > 16){
            throw new IllegalArgumentException("Número negativo");
        }
        
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
