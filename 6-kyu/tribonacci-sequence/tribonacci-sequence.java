import java.util.Arrays;
​
public class Xbonacci {
​
    public static double[] tribonacci(double[] s, int n) {
        double[] d = Arrays.copyOf(s, n);
        for(int i = 3; i < d.length; i++){
            d[i] = d[i-1] + d[i-2] + d[i-3];
        }
        return d;
    }
}