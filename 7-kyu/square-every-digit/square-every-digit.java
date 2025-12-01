public class SquareDigit {
​
  public int squareDigits(int n) {
   String num = String.valueOf(n);
        StringBuilder builder = new StringBuilder();
        String sqr = null;
        for (int i = 0; i < num.length(); i++) {
            int q = Integer.parseInt(String.valueOf(num.charAt(i)));
            q = q * q;
            sqr = builder.append(q).toString();
        }
        return Integer.parseInt(sqr);
  }
}