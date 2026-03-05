import java.util.ArrayList;
import java.util.Arrays;
public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
    int[] counts = new int[26]; 
    for (char c : str1.toCharArray()) {
        counts[c - 'a']++;
    }
    for (char c : str2.toCharArray()) {
        if (--counts[c - 'a'] < 0) {
            return false;
        }
    }
    return true;
 }
}