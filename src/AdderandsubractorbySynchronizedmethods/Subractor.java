package AdderandsubractorbySynchronizedmethods;

import java.util.concurrent.Callable;

public class Subractor implements Callable<Void> {
    private Value value;
    public Subractor(Value value) {
        this.value = value;
    }
    public Void call() throws Exception{
        for(int i = 1; i <= 100000 ; i++){
           // System.out.println("Subractor # "+i);
            value.decrement(i);
        }
        return null;
    }
}
