package producerConsumer1.synchronizationblocks;

public class producer implements Runnable{
    private Store store;
    producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
      while(true) {
          synchronized (store) {
              if (store.getMaxSize() > store.getItems().size())
                  store.add(new Object());
          }
      }
    }
}
