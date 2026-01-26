import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Kata{
  
  public static String binaryAddition(int a, int b){
    int sum = a + b;
        return new StringBuilder(IntStream.iterate(sum, n -> n > 0, n -> n / 2).map(n -> n % 2).mapToObj(String :: valueOf).collect(Collectors.joining())).reverse().toString();
  }
}