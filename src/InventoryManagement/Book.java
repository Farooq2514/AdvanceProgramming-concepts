package InventoryManagement;

public class Book extends Item {
    private String author;

    public Book(String id, String name , int quantity  , String author , double price ) {
        super(id, name, price, quantity);
        this.author = author;
    }
    public Book(String author){
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
