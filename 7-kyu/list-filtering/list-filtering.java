import java.util.List;
import java.util.ArrayList;
​
public class Kata {
  
 public static List<Object> filterList(final List<Object> list) {
        List<Object> ints  = new ArrayList<>();
        for(Object o : list){
            if(o instanceof  Integer){
                ints.add(o);
            }
        }
        return ints;
    }
}
​