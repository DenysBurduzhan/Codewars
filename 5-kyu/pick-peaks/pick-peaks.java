import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
​
public class PickPeaks {
​
   public static Map<String,List<Integer>> getPeaks(int[] arr) {
        List<Integer> picks = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(i != 0 && i != arr.length-1) {
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1] ) {
                    picks.add(arr[i]);
                    pos.add(i);
                } else if (arr[i] > arr[i-1] && arr[i] == arr[i+1]) {
                    int temp = i;
                    while (i < arr.length -1 && arr[i] == arr[i+1]) {
                        i++;
                    }
                    if(i != arr.length-1 ) {
                        if (arr[i] > arr[i + 1]) {
                            picks.add(arr[i]);
                            pos.add(temp);
                        }
                    }
                }
            }
        }
        map.put("pos",pos);
        map.put("peaks",picks);
        return map;
    }
}