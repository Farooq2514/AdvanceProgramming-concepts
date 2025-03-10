package producerConsumer1.semaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Store {
   // private List<Object> items = new ArrayList<>();
    private ConcurrentLinkedQueue<Object>items = new  ConcurrentLinkedQueue<>();
    private int maxsize = 5;



    public  void add(Object item){
        System.out.println("Item is being produced "+items.size());
       items.add(item);
    }

    public  void remove(){
        System.out.println("Item is being produced "+items.size());
        items.remove();
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public void setItems(ConcurrentLinkedQueue<Object> items) {
        this.items = items;
    }

    public int getMaxSize() {
        return maxsize;
    }
}
