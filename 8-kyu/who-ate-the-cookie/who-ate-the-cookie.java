public class Cookie {
  public static String cookie(Object x) {
        String result = "Who ate the last cookie? It was ";
        if(x instanceof String){
            return result + "Zach!";
        }else if(x instanceof Integer || x instanceof Double){
            return result + "Monica!";
        }
        return result + "the dog!";
    }
}