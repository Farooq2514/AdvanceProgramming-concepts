package Generics.InventoryManagement;

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
//        Inventory : Multiple Items
//        General Inventory
//        Clothing Inventory
//        Book Inventory

        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.add(new Electronics("E1", "Laptop",5 ,  5 , 24));
        electronicsInventory.add(new Electronics("E2", "Laptop",5 ,  6 , 24));
        electronicsInventory.add(new Electronics("E3", "Mobile",5, 2, 24));

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Clothing> clothingInventory = new Inventory<>();
        Inventory<Item> itemInventory = new Inventory<>();

        Item item1 = new Electronics("E1", "Laptop", 5 , 6, 650000);
        Item item2 = new Electronics("E2", "Mobile", 5 , 5, 24000);
        Item item3 = new Electronics("E3", "Watch", 5 , 9, 42000);
        Item item4 = new Electronics("E4", "Ipad", 5 , 1, 24500);
        Item item5 = new Electronics("E5", "Speaker", 5 , 2, 2445);

        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();

        recentlyViewedItems.addRecentlyViewedItem(item3);
        recentlyViewedItems.addRecentlyViewedItem(item1);
        recentlyViewedItems.addRecentlyViewedItem(item5);
        recentlyViewedItems.addRecentlyViewedItem(item2);
        recentlyViewedItems.addRecentlyViewedItem(item5);

        System.out.println("RecentlyViewedItems List : ");
        List<Item> recentlyViewedItemsList = recentlyViewedItems.getRecentlyViewedItems();
        for (Item item : recentlyViewedItemsList) {
            System.out.println(item.getName());
        }
    }
}
