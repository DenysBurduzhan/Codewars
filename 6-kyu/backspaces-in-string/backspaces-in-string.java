public class BackspacesInString {
  public static String cleanString(String s) {
           StringBuilder builder = new StringBuilder();
           for( int i = 0; i < s.length(); i++ ) {
               char ch = s.charAt(i);
               if (ch == '#'){
                   builder.setLength(Math.max(builder.length() -1, 0));
               }else{
                   builder.append(ch);
               }
           }
            return builder.toString();
        }
}