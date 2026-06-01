public class Circle {
  public static double area(double radius) {
    if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        return Math.PI * radius * radius;
  }
}