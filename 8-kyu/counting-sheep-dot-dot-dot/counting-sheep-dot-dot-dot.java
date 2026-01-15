public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null || arrayOfSheeps.length == 0) {
            return 0;
        }
        int counter = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null && sheep) {
                counter++;
            }
        }
        return counter;
    }
}
​