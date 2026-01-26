import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Accumul {
    public static String accum(String s) {
       return IntStream.range(0, s.length()).mapToObj(i -> Character.toUpperCase(s.charAt(i)) + String.valueOf(s.charAt(i)).toLowerCase().repeat(i)).collect(Collectors.joining("-"));
    }
}