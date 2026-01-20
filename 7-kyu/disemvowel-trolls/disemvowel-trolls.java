public class Troll {
    public static String disemvowel(String str) {
        String[] s = str.split("");
        StringBuilder builder = new StringBuilder();
        for (String step : s) {
            if (!step.matches(".*[aeiou]") && !step.matches(".*[AEIOU]")) {
                builder.append(step);
            }
        }
        return builder.toString();
    }
}