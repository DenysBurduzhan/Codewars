public class Pong {
    private final int maxScore;
    private int player1 = 0;
    private int player2 = 0;
    private int turn = 0; 
    private boolean gameOver = false;
​
    public Pong(int maxScore) {
        this.maxScore = maxScore;
    }
​
    public String play(int ballPos, int playerPos) {
        if (gameOver) {
            return "Game Over!";
        }
​
        String result;
        boolean hit = Math.abs(ballPos - playerPos) <= 3;
​
        if (turn % 2 == 0) { 
            if (hit) {
                result = "Player 1 has hit the ball!";
            } else {
                player2++;
                if (player2 == maxScore) {
                    gameOver = true;
                    return "Player 2 has won the game!";
                }
                result = "Player 1 has missed the ball!";
            }
        } else { 
            if (hit) {
                result = "Player 2 has hit the ball!";
            } else {
                player1++;
                if (player1 == maxScore) {
                    gameOver = true;
                    return "Player 1 has won the game!";
                }
                result = "Player 2 has missed the ball!";
            }
        }
​
        turn++;
        return result;
    }
}