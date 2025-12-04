public class DRoot {
 public static int digital_root(int n) {
        String num = Integer.toString(n);
        String[] str = new String[num.length()];
        int sum = 0;
        for(int i = 0; i < num.length();i++){
            str[i]= String.valueOf(num.charAt(i));
            sum += Integer.parseInt(str[i]);
        }
        if(sum >= 10){
            return digital_root(sum);
        }
​
        return sum;
    }
}