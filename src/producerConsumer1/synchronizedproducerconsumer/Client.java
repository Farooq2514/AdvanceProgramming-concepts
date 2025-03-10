package producerConsumer1.synchronizedproducerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 10 ; i++){
           executorService.execute(new producer(store));
        }
        for(int i = 0 ; i < 10 ; i++){
          executorService.execute(new consumer(store));
        }

    }
}
