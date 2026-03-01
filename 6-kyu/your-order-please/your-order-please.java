public class Order {
  public static String order(String words) {
        String[] str = words.split(" ");
        String[] sorted = new String[str.length];
        for (String word : str) {
            for (int j = 0; j < word.length(); j++) {
                if (Character.isDigit(word.charAt(j))) {
                    int index = Integer.parseInt(String.valueOf(word.charAt(j)));
                    sorted[index - 1] = word;
                }
            }
        }
        return words.isEmpty() ? words : String.join(" ", sorted);
    }
}