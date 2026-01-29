import java.util.Arrays;
import java.util.stream.Collectors;
​
public class SpinWords {
       public static String spinWords(String sentence) {
        return  Arrays.stream(sentence.split(" "))
                 .map(str -> str.length() >= 5 ? new StringBuilder(str).reverse() : new StringBuilder().append(str)).collect(Collectors.joining(" "));
    }
}