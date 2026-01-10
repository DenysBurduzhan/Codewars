public class AbbreviateTwoWords {
​
  public static String abbrevName(String name) {
    String[] str = name.split(" ");
        StringBuilder builder = new StringBuilder();
        String first = String.valueOf(str[0].charAt(0)).toUpperCase();
        String last = String.valueOf(str[1].charAt(0)).toUpperCase();
        return builder.append(first).append(".").append(last).toString();
  }
}