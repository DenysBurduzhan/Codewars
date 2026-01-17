public class Kata{
​
  public static int grow(int[] x){
        int sum = 1;
        for(int i : x){
            sum *= i;
        }
        return sum;
  }
​
}