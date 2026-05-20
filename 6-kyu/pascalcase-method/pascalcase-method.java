public class Solution {
​
   public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(String s : str.split(" ")) {
            if(!s.isEmpty()) {
                sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase());
            }
        }
        return str.trim().isEmpty() ? "" : sb.toString();
    }
​
}
​