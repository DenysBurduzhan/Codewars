import java.util.*;
​
public class WeightSort {
    private static int digitSum(String s) {
        return s.chars().map(c -> c - '0').sum();
    }
​
    public static String orderWeight(String str) {
        String[] numbers = str.trim().split("\\s+");
​
        Arrays.sort(numbers,
            Comparator.comparingInt(WeightSort::digitSum)  
                      .thenComparing(String::compareTo));  
​
        return String.join(" ", numbers);
    }
}
​