import java.util.ArrayList;
public class DescendingOrder {
  public static int sortDesc(final int num) {
     ArrayList<Integer> lis = new ArrayList<>();
        String[] str = String.valueOf(num).split("");
        for(String n : str){
            lis.add(Integer.parseInt(n));
        }
        lis.sort((a, b) -> b - a);
        String s = "";
        for(int i : lis){
            s += i;
        }
        return Integer.parseInt(s);
  }
}