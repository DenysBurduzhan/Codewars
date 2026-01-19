public class SmashWords {
​
  public static String smash(String... words) {
    StringBuilder builder = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            if(i < words.length -1){
                builder.append(words[i]).append(" ");
            }else{
                builder.append(words[i]);
            }
        }
        return builder.toString() ;
  }
}