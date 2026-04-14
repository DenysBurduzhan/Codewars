import java.util.Arrays;
import java.util.HashMap;
​
public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < numbers.length; ++i){
            if(map.containsKey(target - numbers[i])){
                res[0] = i;
                res[1] = map.get(target - numbers[i]);
                break;
            }
            map.put(numbers[i], i);
        }
        return res;
    }
}