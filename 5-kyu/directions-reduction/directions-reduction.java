import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
​
public class DirReduction {
   public static String[] dirReduc(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,arr);
        for(int i = 0; i < list.size(); i++) {
            if (i + 1 == list.size()) {
                return list.toArray(new String[0]);
            }
            String first = list.get(i);
            String second = list.get(i + 1);
            if (first.equalsIgnoreCase("North") && second.equalsIgnoreCase("South") ||
                    first.equalsIgnoreCase("South") && second.equalsIgnoreCase("North")) {
                list.remove(i);list.remove(i);
                i = -1;
            } else if(first.equalsIgnoreCase("East") && second.equalsIgnoreCase("West") ||
              first.equalsIgnoreCase("West") && second.equalsIgnoreCase("East")){
                  list.remove(i);list.remove(i);
                  i = -1;
              }
            }
        return list.toArray(new String[0]);
    }
}
​