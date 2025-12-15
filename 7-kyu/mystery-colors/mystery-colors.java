import java.util.HashSet;
import java.util.List;
​
public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer{
    public List<Color> mysteryColors = List.of(Color.values());
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        HashSet<Color> unique = new HashSet<>(mysteryColors);
        return unique.size();
    }
​
    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int counter = 0;
        for (Color mysteryColor : mysteryColors) {
            if (mysteryColor.equals(color)) {
                counter++;
            }
        }
        return counter;
    }
  }