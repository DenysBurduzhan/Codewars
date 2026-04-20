import java.util.HashMap;
​
class Kata {
    public static int numberOfPairs(String[] gloves) {
        HashMap<String, Integer> map = new HashMap<>();
        int result = 0;
        for (String glove : gloves) {
            if (!map.containsKey(glove)) {
                map.put(glove, 1);
            }else{
                map.put(glove, map.get(glove) + 1);
            }
        }
        for(String glove : map.keySet()){
            if(map.get(glove) >= 2){
                result += map.get(glove) / 2;
            }
        }
        return result;
    }
}