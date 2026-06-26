import java.util.Arrays;
import java.util.Comparator;
​
public class Kata {
    public static String[] lineupStudents(String students) {
        return Arrays.stream(students.split(" "))
                .sorted(Comparator
                        .comparingInt(String::length)     
                        .reversed()                        
                        .thenComparing(Comparator.reverseOrder()))
                .toArray(String[]::new);
    }
}