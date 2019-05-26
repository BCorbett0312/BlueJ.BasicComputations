 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String intToBin = Integer.toBinaryString(value);
               
        return intToBin;
    }

    public String printIntegerAsOctal(int value){
        String intToOctal = Integer.toOctalString(value);
        
        return intToOctal;
    }

    public String printIntegerAsHexadecimal(int value){
        String intToHex = Integer.toHexString(value);
        
        return intToHex;
    }

    public static void main(String[] args){

    }
}
