import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
       return IntStream.range(0, repeat).mapToObj(i -> string).collect(Collectors.joining());
    }
}
​