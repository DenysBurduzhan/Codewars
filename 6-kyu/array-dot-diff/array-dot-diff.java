import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Kata {
​
 public static int[] arrayDiff(int[] a, int[] b) {
        Integer[] boxedB = Arrays.stream(b).boxed().toArray(Integer[]::new);
​
        ArrayList<Integer> arr = new ArrayList<>();
        for (int value : a) {
            if (!Arrays.asList(boxedB).contains(value)) {
                arr.add(value);
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
​
}