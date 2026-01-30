import java.util.stream.IntStream;
import java.util.stream.Collectors;
​
public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        String finalWord = word;
        return IntStream.range(0, word.length())
                .mapToObj(i -> finalWord.indexOf(finalWord.charAt(i)) != finalWord.lastIndexOf(finalWord.charAt(i)) ? ")" : "(")
                .collect(Collectors.joining());
    }
}
​
​