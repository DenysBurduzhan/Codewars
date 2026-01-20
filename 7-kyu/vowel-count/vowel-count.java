import java.util.Arrays;
import java.util.HashSet;
public class Vowels {
​
  public static int getCount(String str) {
    HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        return Math.toIntExact(str.chars().mapToObj(s -> (char) s).filter(set::contains).count());
  }
​
}