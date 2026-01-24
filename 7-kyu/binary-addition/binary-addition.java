public class Kata{
  
  public static String binaryAddition(int a, int b){
        int sum = a+b;
        StringBuilder binary =new StringBuilder();
        while(sum != 0){
            if(sum % 2 == 0){
                sum = sum / 2;
                binary.append("0");
            }else{
                sum = sum / 2;
                binary.append("1");
            }
        }
        return binary.reverse().toString();
    }
}