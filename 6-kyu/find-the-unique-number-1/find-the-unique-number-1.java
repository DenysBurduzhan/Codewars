import java.util.Arrays;
​
public class Kata {
    public static double findUniq(double[] arr) {
        double[] newArr = Arrays.stream(arr).distinct().toArray();
        for (double v : newArr) {
            int counter = 0;
            for (double value : arr) {
                if (v == value) {
                    counter++;
                }
            }
            if (counter == 1) {
                return v;
            }
        }
        return arr[0];
    }
}