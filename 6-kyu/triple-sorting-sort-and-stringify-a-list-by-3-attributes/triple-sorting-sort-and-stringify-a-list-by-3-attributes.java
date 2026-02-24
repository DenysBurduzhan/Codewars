import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class TripleSorter {
​
    public static String sort(List<Student> students) {
       return students.stream().sorted(Comparator.comparing(Student::getGpa, Comparator.reverseOrder()).
                thenComparing(Student::getAge).thenComparing(student -> {String[] parts = student.getFullName().split(" ");
                return parts.length > 1 ? parts[1].charAt(0) : parts[0].charAt(0);
                })).map(Student::getFullName).collect(Collectors.joining(","));
    }
}