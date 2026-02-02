import java.util.Arrays;
import java.util.stream.IntStream;
public class StringSplit {
    public static String[] solution(String s) {
        s = s.length() % 2 == 1 ? s +"_" : s;
        String finalS = s;
        return IntStream.range(0, s.length() / 2).mapToObj(i -> finalS.substring(i * 2,i * 2 +2)).toArray(String[] :: new);
    }
}