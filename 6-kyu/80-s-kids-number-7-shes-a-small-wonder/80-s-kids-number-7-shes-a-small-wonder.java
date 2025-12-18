import java.util.*;
​
public class Robot {
    private List<String> lst;
​
    public Robot() {
        lst = new ArrayList<>(Arrays.asList(
        "me", "i", "thank", "you", "for", "already", "know", "understand", "teaching",
        "the", "word", "do", "not", "input"
    ));
    }
​
    public String learnWord(String x) {
        if (x == null || x.isEmpty() || !x.matches("^[a-zA-Z]+$")) {
            return "I do not understand the input";
        }
​
        String lower = x.toLowerCase();
        if (!lst.contains(lower)) {
            lst.add(lower);
            return "Thank you for teaching me " + x;
        }
​
        return "I already know the word " + x;
    }
}