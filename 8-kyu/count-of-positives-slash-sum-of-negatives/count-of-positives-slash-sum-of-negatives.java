import java.util.Arrays;
public class Kata
{
      public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0) {
        return new int[]{};
    }
​
         int pos = 0;
        int neg = 0;
        for (int j : input) {
            if (j > 0) {
                pos++;
            } else if (j < 0) {
                neg += j;
            }
        }
        return new int[]{pos, neg};
    }
}