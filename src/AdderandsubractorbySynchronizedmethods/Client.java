package AdderandsubractorbySynchronizedmethods;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        Value value = new Value();
        Adder adder = new Adder(value);
        Subractor subractor = new Subractor(value);
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
