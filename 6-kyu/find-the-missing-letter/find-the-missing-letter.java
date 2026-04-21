public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    for(int i = 0; i < array.length; i++){
           if(i+1 < array.length){
               int a = array[i];
               int b = array[i+1];
               if(b - a > 1){
                   return (char) (a + 1);
               }
           }
       }
    return ' ';
  }
}