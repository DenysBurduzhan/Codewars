class Kata {
  public static String getMiddle(String word) {
        if(word.length() % 2 == 0){
            return String.valueOf(word.charAt(word.length() / 2 - 1)) + word.charAt(word.length() / 2);
        }
        return String.valueOf(word.charAt(word.length() / 2)); // look, no cycles)
    }
}