public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
         int smallest = Integer.MAX_VALUE;
​
        for(int num : args){
            if(num < smallest){
                smallest = num;
            }
        }
        return smallest;
    }
}