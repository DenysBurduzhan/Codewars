public class Solution {
​
  public static boolean validatePin(String pin) {
        String regex = "^\\d{4}$|^\\d{6}$";
        if(pin.matches(regex)){
                return true;
            }
        return false;
    }
}