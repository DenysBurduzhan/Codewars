import java.util.function.IntUnaryOperator;
​
​
public class AdderFactory {
    public static IntUnaryOperator create(int addTo) {
        return x -> x + addTo;
    }
​
    public static void main(String[] args) {
        IntUnaryOperator f = AdderFactory.create(1);
        System.out.println(f.applyAsInt(4));
    }
}