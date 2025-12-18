public class Plugboard {
    private String wires;
​
    public Plugboard(String wires) throws InvalidPlugboardWiresException {
      int counter = 0;
        if (wires.length() % 2 !=0 || wires.length() > 20){
            throw new InvalidPlugboardWiresException();
        }
        for (int i = 0; i < wires.length(); i++){
            for (int f = i + 1; f < wires.length(); f++){
            if(String.valueOf(wires.charAt(i)).equalsIgnoreCase(String.valueOf(wires.charAt(f)))) {
                counter++;
                if (counter == 1) {
                    throw new InvalidPlugboardWiresException();
                }
            }
            }
        }
        this.wires = wires;
    }
​
​
    public String process(String wire) {
      
        for (int i = 0; i < wires.length(); i++) {
           if(String.valueOf(wires.charAt(i)).equalsIgnoreCase(wire)){
               String[] val = new String[2];
               if(i % 2 == 0){
                   val[0] = String.valueOf(wires.charAt(i));
                   if(i != wires.length() - 1) {
                       val[1] = String.valueOf(wires.charAt(i + 1));
                       return val[1];
                   }
               }
               if(i % 2 != 0){
                   val[1] = String.valueOf(wires.charAt(i));
                   val[0] = String.valueOf(wires.charAt(i - 1));
                   return val[0];
               }
           }
        }
​
​
        return wire;
    }
}
​