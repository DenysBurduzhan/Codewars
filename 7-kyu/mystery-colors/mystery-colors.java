import java.util.ArrayList;
import java.util.List;
public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer{
    public List<Color> mysteryColors = List.of(Color.values());
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        List<Color> unique = new ArrayList<>();
        for(Color un : mysteryColors){
            if(!unique.contains(un)){
                unique.add(un);
            }
        }
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