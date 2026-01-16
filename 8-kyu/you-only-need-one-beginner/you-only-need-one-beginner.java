public class Solution {
​
    public static boolean check(Object[] a, Object x) {
        for (Object b : a){
            if(b.equals(x)){
                return true;
            }
        }
        return false;
    }
​
}