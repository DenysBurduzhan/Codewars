import java.util.HashMap;
​
public class Solution {
    public static String explode(String digits) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            int value = Integer.parseInt(digits.charAt(i) + "");
            String key = String.valueOf(value);
            if(!map.containsKey(key)) {
                map.put(key, value);
            }else{
                map.put(key, map.get(key) * value);
            }
            sb.append(String.valueOf(digits.charAt(i)).repeat(Math.max(0, value)));
        }
        return sb.toString();
    }
}