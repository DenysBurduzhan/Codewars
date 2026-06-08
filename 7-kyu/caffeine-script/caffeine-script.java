public class CaffeineBuzz {
    public static String caffeineBuzz(int n) {
        if (n % 3 == 0) {
            String result = (n % 4 == 0) ? "Coffee" : "Java";
            if (n % 2 == 0) result += "Script";
            return result;
        }
        return "mocha_missing!";
    }
}