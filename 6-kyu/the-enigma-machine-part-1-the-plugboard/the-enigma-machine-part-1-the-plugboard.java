public class Plugboard {
    private String wires;
​
    public Plugboard(String wires) throws InvalidPlugboardWiresException {
        if (wires.length() % 2 !=0 || wires.length() > 20){
            throw new InvalidPlugboardWiresException();
        }
        for (int i = 0; i < wires.length(); i++){
            for (int f = i + 1; f < wires.length(); f++){
            if(wires.charAt(i) == wires.charAt(f)) {
                    throw new InvalidPlugboardWiresException();
            }
            }
        }
        this.wires = wires;
    }
​
​
    public String process(String wire) {
        for (int i = 0; i < wires.length(); i += 2) {
            char a = wires.charAt(i);
            char b = wires.charAt(i + 1);
            if (wire.equalsIgnoreCase(String.valueOf(a))) return String.valueOf(b);
            if (wire.equalsIgnoreCase(String.valueOf(b))) return String.valueOf(a);
        }
        return wire;
​
    }
}