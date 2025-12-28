public class Kata {
​
  public static String solution(String str) {
        String rev = "";
        for(int i = 0; i < str.length(); i++){
            rev += str.charAt(str.length() -1 -i);
        }
        return rev;
    }
​
}