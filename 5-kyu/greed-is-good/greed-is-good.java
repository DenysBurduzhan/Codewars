public class Greed{
  public static int greedy(int[] dice){
    int[] counts = new int[7];
        for (int d : dice) {
            counts[d]++;
        }
​
        int result = 0;
​
        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 3) {
                if (i == 1) {
                    result += 1000;
                } else {
                    result += i * 100;
                }
                counts[i] -= 3;
            }
        }
        result += counts[1] * 100;
        result += counts[5] * 50;
​
        return result;
  }
}