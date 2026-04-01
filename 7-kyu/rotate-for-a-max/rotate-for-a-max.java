public class MaxRotate {
​
    public static long maxRot(long n) {
        String numStr = String.valueOf(n);
        long max = n;
​
        for (int i = 0; i < numStr.length() - 1; i++) {
            String fixed = numStr.substring(0, i);
            String rotating = numStr.substring(i);
            rotating = rotating.substring(1) + rotating.charAt(0);
            numStr = fixed + rotating;
            long rotated = Long.parseLong(numStr);
            if (rotated > max) {
                max = rotated;
            }
        }
        return max;
    }
}