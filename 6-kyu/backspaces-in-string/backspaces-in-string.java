import java.util.ArrayList;
import java.util.Arrays;
public class BackspacesInString {
 public static String cleanString(String s) {
            ArrayList<String> str = new ArrayList<>(Arrays.asList(s.split("")));
            ArrayList<String> str1 = new ArrayList<>();
            for(int i = 0; i < str.size(); i++){
                if(!str.get(i).equals("#")){
                    str1.add(str.get(i));
                }else if(!str1.isEmpty()){
                    str1.remove(str1.size()-1);
                }
            }
            return String.join("" , str1);
        }
}