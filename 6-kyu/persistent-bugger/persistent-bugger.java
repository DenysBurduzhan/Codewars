class Persist {
  public static int persistence(long n) {
        String str = String.valueOf(n);
        int per = 1;
        int counter = 0;
       while (str.length() != 1) {
           for (int i = 0; i < str.length(); i++) {
               per *= Integer.parseInt(String.valueOf(str.charAt(i)));
           }
           str = per + "";
           per = 1;
           counter++;
       }
        return counter;
    }
}