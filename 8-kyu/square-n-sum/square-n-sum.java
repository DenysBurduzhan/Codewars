public class Kata
 {
  public static int squareSum(int[] n)
    {
        int num = 0;
        for(int j : n){
           num += (int) Math.pow(j,2);
        }
        return num;
    }
 }