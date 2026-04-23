import java.util.Arrays;
​
public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String first = s[0];
        return String.join("***", first.split(""));
    }
}