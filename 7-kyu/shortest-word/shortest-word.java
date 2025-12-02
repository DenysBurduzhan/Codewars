public class Kata {
    public static int findShort(String s) {
        String[] arr = s.split(" ");
        String min = arr[0];
        for(String value : arr){
            if(value.length() < min.length()){
                min = value;
            }
        }
        return min.length();
    }
}