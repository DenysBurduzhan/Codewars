public class Kata {
    public static String rot13(String str) {
        char[] alphabet = {
            'A','B','C','D','E','F','G','H','I','J','K','L','M',
            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
        };
​
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
​
            if (Character.isLetter(ch)) {
                for (int c = 0; c < alphabet.length; c++) {
                    if (String.valueOf(ch).equalsIgnoreCase(String.valueOf(alphabet[c]))) {
                        int newIndex = (c + 13) % 26;
                        char newChar = alphabet[newIndex];
                        builder.append(Character.isUpperCase(ch) ? newChar : Character.toLowerCase(newChar));
                        break;
                    }
                }
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}