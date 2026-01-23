public class XO {
  
  public static boolean getXO (String str) {
    
    return str.toLowerCase().replaceAll("o", "").length() == str.toLowerCase().replaceAll("x", "").length();
    
  }
}