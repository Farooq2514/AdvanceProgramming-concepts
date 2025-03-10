package producerConsumer1.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store;
        store = new Store();
        Semaphore producerSemaphore = new Semaphore(5);
       Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 10 ; i++){
           executorService.execute(new producer(store, producerSemaphore , consumerSemaphore) );
        }
        for(int i = 0 ; i < 10 ; i++){
          executorService.execute(new consumer(store ,  producerSemaphore , consumerSemaphore ));
        }

    }
}
