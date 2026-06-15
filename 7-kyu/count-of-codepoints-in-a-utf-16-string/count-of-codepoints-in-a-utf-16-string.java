class Kata {
    public static int getRealLength(String str) {
       return str.codePointCount(0, str.length());
    }
}