import java.util.Arrays;
public class StringSplit {
    public static String[] solution(String s) {
        int length = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
       String[] str = new String[length];
        int j = 0;
       for(int i = 0; i < s.length(); i++){
           if(i == s.length() - 1){
               str[j] = s.charAt(i) + "_";
           }else {
               str[j] = s.substring(i, i + 2);
               i += 1;
               j++;
           }
       }
        return str;
    }
}