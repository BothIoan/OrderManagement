package Models;

public class Item {
    private int id;
    private String item_name;
    private int price;
    private int quantity;
    public Item(){}
    public Item(int id, String item_name, int price, int quantity) {
        this.id = id;
        this.item_name = item_name;
        this.price = price;
        this.quantity= quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
