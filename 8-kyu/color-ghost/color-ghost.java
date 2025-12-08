import java.util.Random;
​
public class Ghost {
    private static final String[] COLORS = {"white", "yellow", "purple", "red"};
    private final String color;
​
    public Ghost() {
        Random random = new Random();
        this.color = COLORS[random.nextInt(COLORS.length)];
    }
​
    public String getColor() {
        return color;
    }
}
​