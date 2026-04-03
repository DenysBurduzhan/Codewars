public class Kata {
    public static String firstNonRepeatingLetter(String s) {
    int[] codePoints = s.codePoints().toArray();
​
    for (int i = 0; i < codePoints.length; i++) {
        boolean unique = true;
        for (int j = 0; j < codePoints.length; j++) {
            if (i != j && Character.toLowerCase(codePoints[i]) == Character.toLowerCase(codePoints[j])) {
                unique = false;
                break;
            }
        }
        if (unique) {
            return new String(Character.toChars(codePoints[i]));
        }
    }
    return "";
}
}