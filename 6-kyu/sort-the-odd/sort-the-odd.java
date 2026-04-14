import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Kata {
   public static int[] sortArray(int[] array) {
        int[] sorted = new int[array.length];
        List<Integer> odd = new ArrayList<>();
        for (int j : array) {
            if (j % 2 != 0) {
                odd.add(j);
            }
        }
        odd.sort(Comparator.comparingInt(a -> a));
​
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                odd.add(i, array[i]);
            }
            sorted[i] = odd.get(i);
        }
        return sorted;
    }
}