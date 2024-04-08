package EJERCICIOSIII;

public class Fraction {
    private int num;
    private int den;

    

    public Fraction(int num, int den) throws NullDenominatorException {
        if(num == 0 || den == 0){
            throw(new NullDenominatorException("No se puede divir entre 0"));
        }
        this.num = num;
        this.den = den;
    }



    public static void main(String[] args){
        try {
            Fraction fraccion = new Fraction(0, 0);
        } catch (NullDenominatorException e) {
            e.printStackTrace();
        }
        
    }
}
