package producerConsumer1.semaphores;

import java.util.concurrent.Semaphore;

public class producer implements Runnable{
    private Store store;
    private Semaphore producerSemaphore ,  consumerSemaphore;
    producer(Store store ,  Semaphore producerSemaphore , Semaphore consumerSemaphore ){
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
      while(true){
          try{
              producerSemaphore.acquire();
          }catch(InterruptedException e){
              throw new RuntimeException(e);
          }
          store.add(new Object());
          consumerSemaphore.release();
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
    }
}
