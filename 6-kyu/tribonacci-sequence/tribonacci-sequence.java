import java.util.Arrays;
​
public class Xbonacci {
​
    public static double[] tribonacci(double[] s, int n) {
        double[] d = new double[n];
        if(n <= 3 && n > 0){
            System.arraycopy(s, 0, d, 0, n);
            return d;
        }else if(n < 1){
            return new double[]{};
        }
​
        for(int i = 0; i < d.length; i++){
            if(i >= 3){
                d[i] = d[i -3] + d[i - 2] + d[i -1];
            }else{
                d[i] = s[i];
            }
        }
        return d;
    }
}