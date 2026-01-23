public class isogram {
    public static boolean  isIsogram(String str) {
      if(str.isEmpty()){
            return true;
        }
        String[] s = str.split("");
        int counter = 0;
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s.length; j++){
                String a = String.valueOf(str.charAt(i));
                String b = String.valueOf(str.charAt(j));
                if(a.equalsIgnoreCase(b)){
                    counter++;
                }
                if(counter == 2){
                    return false;
                }
            }
            counter = 0;
        }
        return true;
    } 
}