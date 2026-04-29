import java.util.*;
​
public class Kata {
​
    public static String high(String s) {
        return Arrays.stream(s.split(" ")).
                max(Comparator.comparingInt(
                        word -> word.chars().map(c -> c - 'a' + 1).sum())).
                orElse("");
    }
}