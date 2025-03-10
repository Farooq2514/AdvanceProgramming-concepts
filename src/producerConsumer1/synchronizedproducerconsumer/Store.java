package producerConsumer1.synchronizedproducerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Object> items = new ArrayList<>();
    private int maxsize = 5;
    public void add(Object item){
        System.out.println("Item is being produced "+items.size());
       items.add(item);
    }
    public void remove(){
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
