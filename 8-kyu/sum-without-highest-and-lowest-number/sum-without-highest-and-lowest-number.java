import java.util.Arrays;
public class Kata
{
  public static int sum(int[] numbers)
  {
    if(numbers == null || numbers.length <= 1){
            return 0;
        }
        return Arrays.stream(numbers).sum() - Arrays.stream(numbers).min().getAsInt() - Arrays.stream(numbers).max().getAsInt();
  }
}