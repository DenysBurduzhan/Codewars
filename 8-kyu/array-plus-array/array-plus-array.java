public class Sum {
​
  public static int arrayPlusArray(int[] arr1, int[] arr2){
        return sumOfArray(arr1) + sumOfArray(arr2);
    }
​
    public static int sumOfArray(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
​
}