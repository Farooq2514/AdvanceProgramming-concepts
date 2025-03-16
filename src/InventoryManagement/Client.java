package InventoryManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
         items.add(new Electronics("1" , "Laptop" , 5, 3 , 65000));
         items.add(new Clothing("1" , "T-shirt" , 11 , 1 , 32 ,  1500 ));
         items.add(new Book("1" , "Quality Thoughts" , 5 , "Umar Farooq" , 2500));
        System.out.println("Items default are ");
        for(Item item : items){
            System.out.println(item.getName());
        }
        Collections.sort(items);
        System.out.println("Items sorted based on price are ");
        items.get(0).compareTo(items.get(1));
        for(Item item : items){
            System.out.println(item.getName());
        }
    }
}
