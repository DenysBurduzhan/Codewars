import java.util.Arrays;
import java.util.stream.Collectors;
​
public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.trim().split(" ")).
                map(s -> s.matches("[a-zA-Z]+")? s.substring(1).concat(s.substring(0,1)).concat("ay") : s).
                collect(Collectors.joining(" "));
    }
}