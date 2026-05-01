import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
​
public class Kata {
​
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> result = new ArrayList<>();
        for (int[] ints : array) {
            for (int anInt : ints) {
                result.add(anInt);
            }
        }
        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}