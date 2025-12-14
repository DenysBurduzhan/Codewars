public class BullsAndCows {
    private final int n;
    private boolean wins;
    private int turns;
​
    public BullsAndCows(int n) {
        if (n < 1000 || n > 9999) {
            throw new IllegalArgumentException();
        }
        String num = String.valueOf(n);
        if (num.chars().distinct().count() != 4) {
            throw new IllegalArgumentException();
        }
​
        this.n = n;
        this.wins = false;
        this.turns = 8;
    }
​
    public String compareWith(int n) {
        String num = "" + this.n;
        String num1 = "" + n;
​
        if (wins) {
            return "You already won!";
        }
​
        if (turns == 0) {
            return "Sorry, you're out of turns!";
        }
​
        if (n < 1000 || n > 9999 || num1.chars().distinct().count() != 4) {
            throw new IllegalArgumentException();
        }
​
​
        char[] arr = new char[num.length()];
        int bull = 0;
        int cow = 0;
​
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num1.charAt(i);
            if (num.charAt(i) == num1.charAt(i)) {
                bull++;
            } else if (num.contains(String.valueOf(arr[i]))) {
                cow++;
            }
        }
​
        turns--;
​
        if (bull == num.length()) {
            wins = true;
            return "You win!";
        }
​
        return bull + " bull" + (bull != 1 ? "s" : "") +
                " and " +
                cow + " cow" + (cow != 1 ? "s" : "");
    }
}