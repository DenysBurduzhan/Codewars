public class Kata {
​
    public static String encrypt(final String text, final int n) {
        if (text == null || text.isEmpty() || n <= 0) {
            return text;
        }
        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (i % 2 != 0) {
                    part1.append(text.charAt(i));
                } else {
                    part2.append(text.charAt(i));
                }
            }
        return n > 1 ? encrypt(part1.append(part2).toString(), n - 1) : part1.append(part2).toString();//" Tah itse sits!"
    }
​
    public static String decrypt(final String encryptedText, final int n)  {
        if (encryptedText == null || encryptedText.isEmpty() || n <= 0) {
            return encryptedText;
        }
        String result = encryptedText;
        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder(result.length());
            int half = result.length() / 2;
            String oddPart = result.substring(0, half);
            String evenPart = result.substring(half);
​
​
            int oddIndex = 0, evenIndex = 0;
            for (int j = 0; j < result.length(); j++) {
                if (j % 2 == 0) {
                    builder.append(evenPart.charAt(evenIndex++));
                } else {
                    builder.append(oddPart.charAt(oddIndex++));
                }
            }
            result = builder.toString();
        }
        return result;
    }
}