public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return yourPoints > Kata.sum(classPoints) / classPoints.length;
    }
    
    public static int sum(int[] classPoints){
        int sum = 0;
        for(int i : classPoints){
            sum += i;
        }
        return sum;
    }
}