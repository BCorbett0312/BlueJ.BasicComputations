 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger giantNum = new BigInteger("1");
        for (int i = 2; i <= value; i++){
            giantNum = giantNum.multiply(BigInteger.valueOf(i));
        }
        
        return giantNum;
    }

}
