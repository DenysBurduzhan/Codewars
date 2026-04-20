import java.util.HashMap;
​
class Kata {
    public static int numberOfPairs(String[] gloves) {
        HashMap<String, Integer> map = new HashMap<>();
        int result = 0;
        int count = 0;
        for (String glove : gloves) {
            count = map.getOrDefault(glove, 0);
            map.put(glove, count + 1);
        }
        for(String glove : map.keySet()){
            if(map.get(glove) >= 2){
                result += map.get(glove) / 2;
            }
        }
        return result;
    }
}