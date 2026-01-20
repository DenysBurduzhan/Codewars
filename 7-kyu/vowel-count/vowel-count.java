 public class Vowels {
​
   public static int getCount(String str) {
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            String s = String.valueOf(str.charAt(i));
            if(s.matches(".*[aeiou]")){
                count++;
            }
        }
        return count;
    }
​
}