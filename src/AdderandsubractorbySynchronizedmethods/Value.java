package AdderandsubractorbySynchronizedmethods;

public class Value {
    private int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x=x;
    }
    synchronized void increment(int i){
        x=x+i;
    }
    synchronized void decrement(int i){
        x=x-i;
    }
}
