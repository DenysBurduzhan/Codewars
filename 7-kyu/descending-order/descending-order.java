 public class DescendingOrder {
  public static int sortDesc(final int num) {
    String[] str = String.valueOf(num).split("");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - 1; j++) {
                int a = Integer.parseInt(str[j]);
                int b = Integer.parseInt(str[j + 1]);
                if (b > a) {
                    str[j] = String.valueOf(b);
                    str[j + 1] = String.valueOf(a);
                }
            }
        }
        return Integer.parseInt(String.join("", str));
  }
}