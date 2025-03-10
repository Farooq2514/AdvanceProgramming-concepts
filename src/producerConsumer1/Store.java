package producerConsumer1;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Object> items = new ArrayList<>();
    private int maxsize = 5;
    public synchronized void add(Object item){
        System.out.println("Item is being produced "+items.size());
       items.add(item);
    }
    public synchronized void remove(){
        System.out.println("Item is being produced "+items.size());
        items.remove(items.size()-1);
    }
//    public void getMaxSize(int maxsize){
//    this.maxsize = maxsize;
//    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public int getMaxSize() {
        return maxsize;
    }
}
