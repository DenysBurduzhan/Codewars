import java.util.Arrays;
​
public class Remover {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) return new int[0];
        int min = Arrays.stream(numbers).min().getAsInt();
​
        int indexToRemove = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                indexToRemove = i;
                break;
            }
        }
​
        int[] result = new int[numbers.length - 1];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i != indexToRemove) {
                result[j++] = numbers[i];
            }
        }
​
        return result;
    }
}
​