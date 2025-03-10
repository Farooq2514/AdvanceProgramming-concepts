package producerConsumer1.synchronizationblocks;

public class consumer implements  Runnable {
    private Store store;
    public consumer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.getItems().size() > 0) {
                    store.remove();
                }
            }
        }
    }
}
