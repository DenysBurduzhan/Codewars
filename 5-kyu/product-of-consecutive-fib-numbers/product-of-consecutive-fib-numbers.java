public class ProdFib { 
  
  public static long[] productFib(long prod) {
        long first = 0;
        long second = 1;
        while (first * second < prod){
            long next = first + second;
            first = second;
            second = next;
        }
        if(first * second == prod){
            return new long[]{first,second,1};
        }
        return new long[]{first,second,0};
    }
}