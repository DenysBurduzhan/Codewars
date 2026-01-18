import java.util.stream.Stream;
​
public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return Stream.of(mpg * fuelLeft).anyMatch(i -> i >= distanceToPump);
  }
  
}