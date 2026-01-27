public class FindOdd {
    public static int findIt(int[] a) {
        int counter = 0;
        for(int i : a){
            for(int j = 0; j < a.length; j++){
                if(i == a[j]){
                    counter++;
                }
                if(j == a.length -1){
                    if(counter % 2 != 0){
                        return i;
                    }else{
                        counter = 0;
                    }
                }
            }
        }
        return a[0];
    }
}