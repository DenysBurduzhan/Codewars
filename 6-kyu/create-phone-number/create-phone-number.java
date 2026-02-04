public class Kata {
  public static String createPhoneNumber(int[] numbers) {
        String str = "";
        for(int i : numbers){
            str += "" + i;
        }
        StringBuilder builder = new StringBuilder();
        return builder.append("(").append(str.substring(0, 3)).append(") ").append(str.substring(3, 6)).append("-").append(str.substring(6, str.length())).toString();
    }
}