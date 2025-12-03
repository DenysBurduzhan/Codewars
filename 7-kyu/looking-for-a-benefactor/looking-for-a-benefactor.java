public class NewAverage {
  
   public static long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        double expected = navg * (arr.length + 1) - sum;
        if (expected <= 0) {
            throw new IllegalArgumentException("Expected donation must be positive");
        }
        return (long) Math.ceil(expected);
    }
}