public class SetBits {
    public static long eliminateUnsetBits(String number) {
        String onlyOnes = number.replace("0", "");
        if (onlyOnes.isEmpty()) {
            return 0L;
        }
        return Long.parseLong(onlyOnes, 2);
    }
}
​