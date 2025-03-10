package Addition_and_Subraction_usingLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws Exception{
        Lock lock = new ReentrantLock();
        Value value = new Value();

        Adder adder = new Adder(value , lock);
        Subractor subractor = new Subractor(value,  lock);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Void> adderfuture = executorService.submit(adder);
        Future<Void> subractorFuture = executorService.submit(subractor);
        try {
            adderfuture.get();
            subractorFuture.get();
        }
        catch(Exception e){

        }
        System.out.println("This is the final "+value.getX());
    }
}
