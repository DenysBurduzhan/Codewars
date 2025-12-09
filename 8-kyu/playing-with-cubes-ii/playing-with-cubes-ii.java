public class Cube {
​
  /*
  This cube needs help!
  Define a constructor (or more) such that one can instantiate an object 
  via it, handling either no arguments or a single integer
  */
​
  private int side;
    public Cube(){
        side = 0;
    }
    public Cube( int side){
        this.side = side;
    }
​
    public int getSide() {
        if(side < 0){
            return side * -1;
        }
        return side;
    }
​
    public void setSide(int side) {
        if(side < 0){
            side = side * -1;
        }
        this.side = side;
    }
​
}