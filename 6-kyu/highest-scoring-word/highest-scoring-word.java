import java.util.*;
public class Kata {
​
  public static String high(String s) {
        int sum = 0;
       String[] words = s.split(" ");
        int[] num = new int[words.length];
       for (int j = 0; j <  words.length; j++ ) {
           String word = words[j];
           for(int i = 0; i < word.length(); i++) {
               sum += word.charAt(i) + 1 - 'a';
           }
           num[j] = sum;
           sum = 0;
       }
       for(int i = 0; i <= num.length ; i++ ) {
           for( int j = 0; j < num.length; j++ ) {
               if (j + 1 < num.length && num[j] < num[j + 1]) {
                   int temp = num[j];
                   num[j] = num[j + 1];
                   num[j + 1] = temp;
                   String tempS = words[j];
                   words[j] = words[j + 1];
                   words[j + 1] = tempS;
               }
           }
       }
        return words[0];
    }
​
}