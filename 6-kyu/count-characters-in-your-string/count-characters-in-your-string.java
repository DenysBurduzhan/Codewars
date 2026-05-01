import java.util.HashMap;
import java.util.Map;
​
public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
            }else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }
}