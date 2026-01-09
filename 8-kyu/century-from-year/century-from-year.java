public class Solution {
  public static int century(int number) {
    double cent = (double) number / 100;
        return (int) Math.ceil(cent);
  }
}