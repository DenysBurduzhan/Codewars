import java.util.Arrays;
public class ZywOo {
  public static int[] take(int[] arr, int n) {
    return Arrays.copyOf(arr, Math.min(n, arr.length));
  }
}