public class ZywOo {
    public static int[] take(int[] arr, int n) {
        if (n > arr.length) n = arr.length;
        return java.util.Arrays.copyOfRange(arr, 0, n);
    }
}
​