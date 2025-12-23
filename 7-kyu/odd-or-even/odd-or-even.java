public class Codewars {
​
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        if(sum % 2 == 0){
            return "even";
        }
​
        return "odd";
    }
  }