import java.util.function.IntSupplier;
​
public class PaperFold implements IntSupplier {
   private int index = 0;
    private StringBuilder seq = new StringBuilder("1");
​
    @Override
    public int getAsInt() {
        while (index >= seq.length()) {
            StringBuilder next = new StringBuilder(seq);
            next.append('1');
            for (int i = seq.length() - 1; i >= 0; i--) {
                next.append(seq.charAt(i) == '1' ? '0' : '1');
            }
            seq = next;
        }
        return seq.charAt(index++) - '0';
    }
}