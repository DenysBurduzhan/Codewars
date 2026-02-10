public class Max {
  public static int sequence(int[] arr) {
        int CurrentSum = 0;
        int MaxSum = 0;
        for(int i : arr){
            CurrentSum= Math.max(i, CurrentSum + i);
            MaxSum = Math.max(MaxSum,CurrentSum );
        }
        return MaxSum;
    }
}