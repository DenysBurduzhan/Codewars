public class A { 
  private static int current = 1;
    private static final int q = 2;
  public static int getNumber() {
        int result = current;
        current *= q;
        return result;
    }
}