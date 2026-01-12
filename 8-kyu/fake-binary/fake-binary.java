public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < numberString.length(); i++){
            int n = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            if(n < 5){
                builder.append(0);
            }else{
                builder.append(1);
            }
        }
        return builder.toString();
    }
}