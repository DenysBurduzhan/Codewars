import java.util.Map;
import java.util.stream.Collectors;
​
public class Kata {
    public static Map<Character, Integer> count(String str) {
        return str.chars()
               .mapToObj(c -> (char) c)
               .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));
    }
}