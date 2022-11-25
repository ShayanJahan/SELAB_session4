public class Square {
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int computeArea(){
        return this.length * this.length;
    }
}
