import java.util.stream.Collectors;
​
class Kata {
    static String alphabetPosition(String text) {
        return text.chars().filter(Character :: isLetter).map(Character :: toLowerCase).map(c -> c - 'a' + 1).mapToObj(String :: valueOf).collect(Collectors.joining(" "));
    }
}
​