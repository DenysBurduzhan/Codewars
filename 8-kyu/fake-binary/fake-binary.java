import java.util.Arrays;
import java.util.stream.Collectors;
public class FakeBinary {
    public static String fakeBin(String numberString) {
        return Arrays.stream(numberString.split("")).map(i -> i.replaceAll("[1-4]", "0").replaceAll("[5-9]", "1")).collect(Collectors.joining());
    }
}