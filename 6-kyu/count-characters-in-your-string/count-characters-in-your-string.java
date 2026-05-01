import java.util.Map;
import java.util.stream.Collectors;
​
public class Kata {
    public static Map<Character, Integer> count(String str) {
       return str.chars()
               .mapToObj(c -> (char) c)
               .collect(Collectors.groupingBy(c -> c , Collectors.summingInt(c -> 1)));
    }
}
​