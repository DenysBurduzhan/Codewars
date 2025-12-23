import java.util.Arrays;
public class Codewars {
   public static String oddOrEven (int[] array) {
        String str ;
        return str = Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}