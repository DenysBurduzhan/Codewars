public class Positive{
​
  public static int sum(int[] arr){
        int sum = 0;
        for (int j : arr) {
            if (j > 0) {
                sum += j;
            }
        }
        return sum;
    }
​
}