import java.util.function.ToDoubleFunction;
​
public class FunctionalProgramming {
  public static ToDoubleFunction<Triangle> f = n ->{
        double area = 0.5 * n.base * n.height;
        n.setArea(area);
        return area;
    };
}