package Models;

/**
 *
 */
public class Orders {
    private int id;
    private int client_id;
    private int product_id;
    private int orderQuantity;
    public Orders(){}
    public Orders(int id, int client_id, int product_id, int orderQuantity) {
        this.id = id;
        this.client_id = client_id;
        this.product_id = product_id;
        this.orderQuantity = orderQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_name) {
        this.client_id = client_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int client_address) {
        this.product_id = client_address;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

}