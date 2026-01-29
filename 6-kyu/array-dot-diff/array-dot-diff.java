import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Kata {
​
  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> sort = new ArrayList<>(Arrays.stream(a).boxed().toList());
       for(int i = 0; i < sort.size(); i++){
           for(int j = 0; j < b.length; j++){
               if (!sort.isEmpty() && sort.get(i) == b[j]) {
                   sort.remove(i);
                   i = -1;
                   break;  
               }
           }
       }
        return sort.stream().mapToInt(Integer::intValue).toArray();
  }
​
}