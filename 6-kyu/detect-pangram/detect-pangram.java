import java.util.HashSet;
​
public class PangramChecker {
    public static boolean check(String sentence){
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i < sentence.length(); i++){
            if(Character.isLetter(sentence.charAt(i))){
                set.add(String.valueOf(sentence.charAt(i)));
            }
        }
        return set.size() >= 26;
    }
}