package EJERCICIOSIII;

public class Binario {

    public static int bin2dec(String binaryString) throws BinaryFormatException{
        int decimal = 0;
        int power = 0;
        for (int i = binaryString.length() -1; i >= 0 ; i--) {
            char digit = binaryString.charAt(i);
            if(digit != '0' && digit != '1'){
                throw new BinaryFormatException("No es binario");
            }
            if(digit == '1'){
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Binario.bin2dec("1234"));
        } catch (BinaryFormatException e) {
            e.printStackTrace();
        }
    }

}
