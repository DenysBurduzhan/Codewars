import java.util.ArrayList;
class Kata {
    static String alphabetPosition(String text) {
        String l = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < text.length(); i++){
            for(int f = 0; f < l.length(); f++ ){
                if(String.valueOf(text.charAt(i)).equalsIgnoreCase(String.valueOf(l.charAt(f)))){
                     arr.add(String.valueOf(f + 1));
                    break;
                }
            }
        }
        return String.join(" ", arr);
    }
}
​