import java.util.*;
class Solution{    
    public static String solve(String s) {
            if (isPalindrome(s)) {
                return "OK";
            }
            for (int i = 0; i < s.length(); i++) {
                String candidate = s.substring(0, i) + s.substring(i + 1);
                if (isPalindrome(candidate)) {
                    return "remove one";
                }
            }
            return "not possible";
        }
​
        private static boolean isPalindrome(String s) {
            int l = 0, r = s.length() - 1;
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) return false;
                l++;
                r--;
            }
            return true;
        }
}