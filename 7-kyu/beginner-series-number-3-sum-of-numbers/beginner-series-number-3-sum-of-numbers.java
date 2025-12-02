  public class Sum
  {
     public int GetSum(int a, int b)
    {
        if(a == b){
            return a;
        }
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int sum = 0;
        for (int i = min; i <= max; i++){
            sum += i;
        }
        return sum;
    }
  }