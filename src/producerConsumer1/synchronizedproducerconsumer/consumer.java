package producerConsumer1.synchronizedproducerconsumer;

public class consumer implements  Runnable {
    private Store store;
    public consumer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        while (true) {
            if(store.getItems().size() > 0){
                store.remove();
            }
        }
    }
}
