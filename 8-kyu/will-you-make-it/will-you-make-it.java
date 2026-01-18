public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return fuelLeft * mpg >= distanceToPump;
  }
  
}