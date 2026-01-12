public class Kata {
  public static int[] invert(int[] array) {
   int[] reversed = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversed[i] = array[i] * -1;
        }
        return reversed;
  }
}