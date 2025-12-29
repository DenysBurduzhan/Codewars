public class Kata {
    public static String noSpace(final String x) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < x.length(); i++){
            if(String.valueOf(x.charAt(i)).equals(" ")){
                continue;
            }else{
                builder.append(x.charAt(i));
            }
        }
        return builder.toString();
    }
}