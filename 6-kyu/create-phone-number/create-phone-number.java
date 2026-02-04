public class Kata {
  public static String createPhoneNumber(int[] numbers) {
        String str = "";
        for(int i : numbers){
            str += "" + i;
        }
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str.length() ;i++){
            if(i == 0){
                builder.append("(").append(str.charAt(i));
            } else if (i == 2) {
                builder.append(str.charAt(i)).append(") ");//
            } else if (i == 5) {
                builder.append(str.charAt(i)).append("-");
            }else{
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}