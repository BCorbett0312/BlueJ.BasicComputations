 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        return (angle %= 360) >= 0 ? angle : (angle + 360);
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int normalAngle = Math.floorMod(integer, 360);
        
        return normalAngle;
    }

    public static void main(String[] args){

    }
}
