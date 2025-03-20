package Generics.InventoryManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    //Creates a Storage where each item is stored using id
    private HashMap<String , T>items;
    public Inventory() {
        items = new HashMap<>();
    }
    //Adding the items of the items by the id
    public void  add(T item) {
        items.put(item.getId() , item);
    }
    //removing the item by the id
    public void remove(T item) {
        items.remove(item.getId());
    }
    //Getting elements by the id;
    public T getItem(String itemId) {
        return items.get(itemId);
    }
    //Retreiving all the elements using the id
    public List<T> getItems() {
        return new ArrayList<>(items.values());
    }

}
