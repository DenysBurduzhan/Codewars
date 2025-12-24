public class RemoveChars {
    public static String remove(String str) {
        if(str.length() < 2){
            return " ";
        }
​
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(i == 0 || i == str.length() - 1){
                continue;
            }else {
                builder.append(str.charAt(i));
            }
        }
​
​
        return builder.toString();
    }
}
​