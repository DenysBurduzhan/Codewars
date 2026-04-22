import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
​
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        HashMap<String, String> map = new HashMap<>();
        map.put("NORTH", "SOUTH");
        map.put("EAST", "WEST");
        map.put("SOUTH", "NORTH");
        map.put("WEST", "EAST");
​
        Stack<String> stack = new Stack<>();
        for (String s : arr) {
            if(!stack.isEmpty() && map.get(s).equals(stack.peek())) {
                stack.pop();
            }else{
                stack.push(s);
            }
        }
       return stack.toArray(new String[0]);
    }
}