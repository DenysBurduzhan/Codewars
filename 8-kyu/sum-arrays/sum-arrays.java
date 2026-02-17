public class SumArray {
​
  public static double sum(double[] numbers) {
    double result = 0.0;
    for (double num : numbers) {
      result += num; // прибавляем каждый элемент массива
    }
    return result;
  }
}