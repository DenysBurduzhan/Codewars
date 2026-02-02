import java.util.ArrayList;
import java.util.Arrays;
public class StringSplit {
    public static String[] solution(String s) {
         if(s.length() % 2 == 1){
           s = s +"_";
       }
        ArrayList<String> str = new ArrayList<>();
           for(int i = 0; i < s.length(); i+=2){
               str.add(s.substring(i, i+2));
           }
        return str.toArray(new String[0]);
    }
}