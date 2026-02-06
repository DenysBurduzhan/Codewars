​
 import java.util.stream.Collectors;
import java.util.stream.IntStream;
​
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
            int hours = seconds / 3600;
            int minutes = (seconds / 60) % 60;
            int secs = seconds % 60;
​
            return IntStream.of(hours, minutes, secs)
                    .mapToObj(i -> String.format("%02d", i))
                    .collect(Collectors.joining(":"));
  }
}