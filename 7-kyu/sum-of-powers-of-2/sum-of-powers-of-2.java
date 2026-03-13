import java.util.ArrayList;
import java.util.List;
​
public class Kata {
    public static int[] powers(int n) {
        List<Integer> result = new ArrayList<>();
        int power = 1; 
​
        while (n > 0) {
            if ((n & 1) == 1) { 
                result.add(power);
            }
            n >>= 1;      
            power <<= 1;  
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}