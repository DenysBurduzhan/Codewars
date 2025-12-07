public class Ship {
  private final double draft;
  private final int crew;
    
  public Ship(double draft, int crew) {
    this.draft = draft;
    this.crew = crew;
  }
​
  public double getDraft() {
        return draft;
    }
​
    public int getCrew() {
        return crew;
    }
​
    public boolean isWorthIt(){
        double draft = getDraft();
        int crew = getCrew();
        double weight = 1.5;
        if(draft - crew * weight > 20){
            return true;
        }
        return false;
    }
} 