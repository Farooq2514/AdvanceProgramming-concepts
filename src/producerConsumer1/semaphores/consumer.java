package producerConsumer1.semaphores;

import java.util.concurrent.Semaphore;

public class consumer implements  Runnable {
    private Store store;
    private Semaphore producerSemaphore ,  consumerSemaphore;
    public consumer(Store store ,  Semaphore producerSemaphore , Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while (true) {
            try{
                consumerSemaphore.acquire();
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
                store.remove();
            producerSemaphore.release();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }
    }

