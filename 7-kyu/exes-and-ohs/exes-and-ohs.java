public class XO {
  
  public static boolean getXO (String str) {
        String[] s = str.split("");
        int counterO = 0;
        int counterX = 0;
        for (String i : s){
            if(i.equalsIgnoreCase("o")){
                counterO++;
            }
            if(i.equalsIgnoreCase("x")){
                counterX++;
            }
        }
        return counterX == counterO;
    }
}