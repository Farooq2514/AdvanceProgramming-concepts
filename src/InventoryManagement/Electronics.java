package InventoryManagement;

public class Electronics extends Item{
    private int warranty;

    public Electronics( String id , String name , int quantity ,int warranty , double price) {
        super(id,name,price,quantity);
        this.warranty = warranty;
    }
    public int getWarranty() {
        return warranty;
    }
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
