import java.util.Arrays;
​
public class Kata {
    public static int[] DataReverse(int[] data) {
        int blockSize = 8;
        int numBlocks = data.length / blockSize;
​
        int[] result = new int[data.length];
​
        for (int i = 0; i < numBlocks; i++) {
            int srcBlock = numBlocks - 1 - i;
            for (int j = 0; j < blockSize; j++) {
                result[i * blockSize + j] = data[srcBlock * blockSize + j];
            }
        }
        return result;
    }
}