public class Kata
{
  public static int sum(int[] numbers)
  {
    int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
       if(numbers == null || numbers.length <= 1){
            return 0;
        }
        int sumOfArray = 0;
​
        for(int i : numbers){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
            sumOfArray += i;
        }
        return sumOfArray - min - max;
  }
}