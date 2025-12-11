public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        for (int i = 0; i < source.length(); i++) {
            char current = source.charAt(i);
            boolean isUnique = true;
​
            for (int j = 0; j < source.length(); j++) {
                if (i != j && current == source.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
​
            if (isUnique) {
                return current;
            }
        }
        return null;
    }
  }