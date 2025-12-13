public class BoilingWater{
  
  public static int cookingTime(int eggs){
    int cookingTime = 5;
        int pan = 8;
        int result = 0;
        int i;
        if (eggs > 0 && eggs < 9) {
            result = cookingTime;
        }
        if(eggs % pan == 0){
            result = cookingTime * (eggs / pan);
        } else if (eggs % pan != 0) {
            result = cookingTime * (eggs / pan) + cookingTime;
        }
        return result;
  }
  
}