import java.util.Arrays;
import java.util.stream.Collectors;
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int counter = 0;
        String str = text.toLowerCase();
        for(int i =0; i < str.length(); i++ ){
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                    str = str.replaceAll(String.valueOf(str.charAt(i)), "");
                    j = 0;
                    i = 0;
                }
            }
        }
​
        return counter;
    }
}