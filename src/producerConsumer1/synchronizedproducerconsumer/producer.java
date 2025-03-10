package producerConsumer1.synchronizedproducerconsumer;

public class producer implements Runnable{
    private Store store;
    producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
      while(true){
          if(store.getMaxSize() > store.getItems().size())
        store.add(new Object());
      }
    }
}
