package Addition_and_Subraction_usingLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subractor implements Callable<Void> {
    private Value value;
    private Lock lock;
    public Subractor(Value value ,   Lock lock) {
        this.value = value;
        this.lock = lock;
    }
    public Void call() throws Exception{
        for(int i = 1; i <= 100000 ; i++){
           // System.out.println("Subractor # "+i);
            lock.lock();
            value.setX(value.getX() -i);
            lock.unlock();
        }
        return null;
    }
}
