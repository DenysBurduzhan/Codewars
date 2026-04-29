public class Kata {
​
  public static String high(String s) {
       String result = "";
       int highest = 0;
       for(String word: s.split(" ")) {
         int score = 0;
           for(char c: word.toCharArray()) {
               score += c - 'a' + 1;
               if(score > highest) {
                   highest = score;
                   result = word;
               }
           }
       }
        return result;
    }
​
}