import java.util.HashMap;
import java.util.Map;
​
public class Kata {
​
    public static boolean hasSubpattern(String string) {
​
        Map<Character, Integer> freq = new HashMap<>();
​
        for (char c : string.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
​
        int gcd = 0;
​
        for (int count : freq.values()) {
            gcd = gcd(gcd, count);
        }
​
        return gcd > 1;
    }
​
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
​
        return a;
    }
}