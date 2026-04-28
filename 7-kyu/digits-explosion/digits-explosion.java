public class Solution {
  public static String explode(String digits) {
     StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            int value = Integer.parseInt(digits.charAt(i) + "");
            sb.append(String.valueOf(digits.charAt(i)).repeat(Math.max(0, value)));
        }
        return sb.toString();
  }
}