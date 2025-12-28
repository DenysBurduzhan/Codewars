​
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Kata {
​
  public static String solution(String str) {
        return IntStream.range(0, str.length())              
                .mapToObj(i -> str.charAt(str.length() - 1 - i)) 
                .map(String::valueOf)                      
                .collect(Collectors.joining());
    }
​
}