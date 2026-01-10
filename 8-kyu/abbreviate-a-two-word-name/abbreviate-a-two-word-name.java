import java.util.ArrayList;
import java.util.List;
public class AbbreviateTwoWords {
​
  public static String abbrevName(String name) {
    String[] words = name.split(" ");
        List<String> result = new ArrayList<>();
        for (String word : words) {
            result.add(word.substring(0, 1).toUpperCase());
        }
        return String.join(".", result);
  }
}