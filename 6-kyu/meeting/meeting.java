import java.util.*;
​
class Meeting {
​
    public static String meeting(String s) {
        String[] args = s.toUpperCase().split(";");
        List<String[]> pairs = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            String[] pair = args[i].split(":");
            String first = pair[0];
            pair[0] = pair[1];
            pair[1] = first;
            pairs.add(pair);
        }
        pairs.sort(Comparator.comparing((String[] a) -> a[0]).thenComparing(a -> a[1]));
​
        StringBuilder result = new StringBuilder();
​
        for (String[] person : pairs) {
            result.append("(")
                    .append(person[0])
                    .append(", ")
                    .append(person[1])
                    .append(")");
        }
​
        return result.toString();
    }
}
​