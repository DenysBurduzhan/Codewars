import java.util.*;
​
public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        List<Integer> list = new ArrayList<>();
        for(String ingr : recipe.keySet()){
            if(available.containsKey(ingr) && available.get(ingr) >= recipe.get(ingr)){
                   list.add(available.get(ingr) / recipe.get(ingr));
            }else{
                return  0;
            }
        }
        list.sort(Comparator.comparingInt(a -> a));
        return list.get(0);
    }
}