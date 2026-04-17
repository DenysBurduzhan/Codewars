import java.util.*;
public class EnoughIsEnough {
​
  public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
​
        for (int num : elements) {
            int count = countMap.getOrDefault(num, 0);
​
            if (count < maxOccurrences) {
                result.add(num);
                countMap.put(num, count + 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}