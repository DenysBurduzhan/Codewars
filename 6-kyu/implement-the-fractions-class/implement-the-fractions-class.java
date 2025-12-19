public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;
​
    public Fraction(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        long gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.top = numerator / gcd;
        this.bottom = denominator / gcd;
    }
​
    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }
​
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fraction)) return false;
        return compareTo((Fraction) o) == 0;
    }
​
    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }
​
    public Fraction add(Fraction f2) {
        long newTop = top * f2.bottom + f2.top * bottom;
        long newBottom = bottom * f2.bottom;
        long gcd = gcd(Math.abs(newTop), Math.abs(newBottom));
        return new Fraction(newTop / gcd, newBottom / gcd);
    }
​
    @Override
    public String toString() {
        return top + "/" + bottom;
    }
​
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}