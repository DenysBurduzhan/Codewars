import java.util.Arrays;
​
public class FindOutlier {
    static int find(int[] integers) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for(int i : integers){
            if(i % 2 == 0){
                builder.append(i);
            }else{
                builder2.append(i);
            }
        }
        return builder.length() < builder2.length()  ? Integer.parseInt(builder.toString()) : Integer.parseInt(builder2.toString());
    }
}