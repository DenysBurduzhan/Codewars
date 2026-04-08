class DivSeven {
    public static long[] seven(long m) {
        int steps = 0;
        while (m > 99) { 
            long x = m / 10;     
            long y = m % 10;      
            m = x - 2 * y;      
            steps++;
        }
        return new long[]{m, steps};
    }
}
​