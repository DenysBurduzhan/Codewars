import java.util.*;
​
public class Rays {
    public static int[] status(int[] nums) {
        int n = nums.length;
​
        List<Element> elements = new ArrayList<>();
​
        for (int i = 0; i < n; i++) {
            int countLess = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    countLess++;
                }
            }
            int status = i + countLess;
            elements.add(new Element(nums[i], status, i));
        }
​
        elements.sort(Comparator.comparingInt((Element e) -> e.status)
                                .thenComparingInt(e -> e.index));
​
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = elements.get(i).value;
        }
        return result;
    }
​
    static class Element {
        int value;
        int status;
        int index;
​
        Element(int value, int status, int index) {
            this.value = value;
            this.status = status;
            this.index = index;
        }
    }
}