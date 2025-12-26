public class Kata {
   public static long sumMul(int n, int m) {
        if(m < 1 || n < 1){
            throw new IllegalArgumentException();
        }
        int sum = 0;
        int temp = n;
        while (n < m){
            sum += n;
            n = n + temp;
​
        }
        return sum;
    }
​
}
​