package Generics.InventoryManagement;

public class Clothing extends Item{
    private int size;

    public Clothing(int size){
        this.size = size;
    }
    public Clothing( String id ,  String name ,int quantity,int warranty , int size , double price ){
        super(id, name, price, quantity);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
