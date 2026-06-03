public class Kata {
​
public static String addLetters(String... letters) {
        if (letters.length == 0) return "z";
        int sum = 0;
        for (String letter : letters) {
            sum += letter.charAt(0) - 'a' + 1;
        }
​
        sum = (sum - 1) % 26 + 1;
​
        return String.valueOf((char) ('a' + sum - 1));
    }
}