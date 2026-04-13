public class Geometry{
  public static double squareArea(double A){
        if (A == 0) return 0;
        double r = (2 * A) / Math.PI;
        double area = r * r;
        return Math.round(area * 100.0) / 100.0;
  }
}