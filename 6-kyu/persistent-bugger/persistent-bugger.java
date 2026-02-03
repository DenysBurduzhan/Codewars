class Persist {
  public static int persistence(long n) {
        int steps = 0;
        while (n >= 10){
            n = String.valueOf(n).chars().map(s -> s - '0').reduce(1,(a,b) -> a * b);
            steps++;
        }
        return steps;
    }
}