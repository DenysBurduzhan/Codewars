import java.util.Arrays;
import java.util.stream.Collectors;
public class Kata {
    public static String noSpace(final String x) {
       return Arrays.stream(x.split("")) 
                .filter(ch -> !ch.equals(" ")) 
                .collect(Collectors.joining());
    }
}