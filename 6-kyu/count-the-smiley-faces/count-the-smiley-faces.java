import java.util.*;
​
public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
        String regex = "[:;][~-]?[)D]";
        int count = 0;
        for(String value : arr){
            if(value.matches(regex)){
                 count++;
            }
        }
        return count;
    }
}