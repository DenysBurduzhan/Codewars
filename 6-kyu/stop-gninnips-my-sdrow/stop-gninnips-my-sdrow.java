public class SpinWords {
​
  public String spinWords(String sentence) {
    String[] str = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String value : str){
            if(value.length() < 5){
                builder.append(value).append(" ");
            }else{
                StringBuilder reversed = new StringBuilder(value).reverse();
                builder.append(reversed).append(" ");
            }
        }
        return builder.toString().trim();
    }
}