import java.util.stream.Collectors;
import java.util.stream.Stream;
​
public class RgbToHex {
​
    public static String rgb(int r, int g, int b) {
        return Stream.of(r,g, b).map(i -> Math.max(i, 0)).
                map(i -> Math.min(i, 255)).
                map(i -> String.format("%02X", i)).collect(Collectors.joining());
    }
​
}
​