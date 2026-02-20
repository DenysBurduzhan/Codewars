import java.util.stream.Collectors;
import java.util.stream.IntStream;
​
public class Stairs {
    public static String draw(int n) {
        return IntStream.range(0, n)
                .mapToObj(i -> " ".repeat(i) + "I")
                .collect(Collectors.joining("\n"));
    }
}