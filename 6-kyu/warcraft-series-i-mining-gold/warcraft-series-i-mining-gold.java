import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
​
public class MiningRepresentation {
​
    private static class Worker {
        int pos;
        int dir;
​
        Worker(int pos, int dir) {
            this.pos = pos;
            this.dir = dir;
        }
    }
​
    public static List<String> generate(String path, int time) {
        int n = path.length();
        List<Worker> workers = new ArrayList<>();
​
        for (int i = 0; i < n; i++) {
            char c = path.charAt(i);
​
            if (c == '<') {
                workers.add(new Worker(i, -1));
            } else if (c == '>') {
                workers.add(new Worker(i, 1));
            }
        }
​
        List<String> result = new ArrayList<>();
​
        for (int t = 0; t < time; t++) {
            result.add(render(n, workers));
​
            if (t == time - 1) {
                break;
            }
​
            int count = workers.size();
            int[] nextDir = new int[count];
            int[] nextPos = new int[count];
​
            