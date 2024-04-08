package EJERCICIOSI;

public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }catch(Exception ex){
            System.out.println("Exception in main");
        }
    }

    static void method() throws Exception{
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }catch(Exception ex){
            System.out.println("Exception in method()");
        }
    }
}
