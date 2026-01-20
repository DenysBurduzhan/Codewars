import java.util.Arrays;
import java.util.HashSet;
public class Vowels {
​
  public static int getCount(String str) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int count = 0;
        for(int i =0; i < str.length(); i++){
            String s = String.valueOf(str.charAt(i));
            for(char f : set){
                if(s.contains(String.valueOf(f))){
                    count++;
                }
            }
        }
        return count;
    }
}