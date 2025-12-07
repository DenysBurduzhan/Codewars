public class Block{
  private final int width;
    private final int length;
    private final int height;
​
    Block(int[] ints){
        this.width = ints[0];
        this.length = ints[1];
        this.height = ints[2];
    }
​
    public int getWidth() {
        return width;
    }
​
    public int getLength() {
        return length;
    }
​
    public int getHeight() {
        return height;
    }
​
    public int getVolume(){
​
        return width * height * length;
    }
    public int getSurfaceArea(){
​
        return 2 * ((width * length) + (length * height) + (width * height));
    }
}