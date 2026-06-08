import java.util.function.IntSupplier;
​
public class PaperFold implements IntSupplier {
    @Override
    public int getAsInt() {
        i++;
        return (i & Integer.lowestOneBit(i) << 1) == 0 ? 1 : 0;
    }
   int i = 0;
}
