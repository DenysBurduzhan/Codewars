public class Accumul {
    public static String accum(String s) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i > 0){
                builder.append("-");
            }
            for(int j = 0; j <= i; j++){
                if(j == 0){
                    builder.append(String.valueOf(s.charAt(i)).toUpperCase());
                }else {
                    builder.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
            }
        }
        return builder.toString();
    }
}