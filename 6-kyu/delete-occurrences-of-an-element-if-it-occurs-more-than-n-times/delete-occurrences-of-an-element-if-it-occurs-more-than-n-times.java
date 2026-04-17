import java.util.*;
public class EnoughIsEnough {
​
  public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int counter = 0;
        List<Integer> list = new ArrayList<>();
        for(int n : elements){
            list.add(n);
        }
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                if(Objects.equals(list.get(i), list.get(j))){
                    counter++;
                    if (counter > maxOccurrences) {
                        list.remove(j);
                    }
                }
            }
            counter = 0;
        }
        return maxOccurrences == 0 ? new int[]{} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}