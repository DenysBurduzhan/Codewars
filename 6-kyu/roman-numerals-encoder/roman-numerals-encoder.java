public class Conversion {
​
public static String solution(int n) {
        String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] DECIMAL_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            StringBuilder result = new StringBuilder();
            int remaining = n ;
            for (int i = 0; i < ROMAN_NUMERALS.length; i++) {
                int decimalValue = DECIMAL_VALUES[i];
                String romanNumeral = ROMAN_NUMERALS[i];
                while (remaining >= decimalValue) {
                    result.append(romanNumeral);
                    remaining -= decimalValue;
                }
            }
            return result.toString();
        }
}