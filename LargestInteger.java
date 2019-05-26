



public class LargestInteger {
    Integer largInt;
    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer largInt = integers[0];
        for(int i= 1; i < integers.length; i++){
            if (integers[i] > largInt) {
                largInt = integers[i];
            }
        }
        return largInt;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Integer largInt = Integer.MIN_VALUE;
        for (int i : integers){
            largInt = Math.max(largInt, i);
        }
               
        return largInt;
    }
}
