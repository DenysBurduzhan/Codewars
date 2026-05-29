public class Kata {
​
    public static Boolean isSatorSquare(char[][] tablet) {
​
        int n = tablet.length;
​
        for (int i = 0; i < n; i++) {
​
            for (int j = 0; j < n; j++) {
​
                if (tablet[i][j] != tablet[j][i]
                        || tablet[i][j] != tablet[n - 1 - i][n - 1 - j]) {
​
                    return false;
                }
            }
        }
​
        return true;
    }
}