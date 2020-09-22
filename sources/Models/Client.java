package Models;

public class Client {
    private int id;
    private String client_name;
    private String client_address;
    private String email;

    public Client (){}
    public Client(int id, String client_name, String client_address, String email) {
        this.id = id;
        this.client_name = client_name;
        this.client_address = client_address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_address() {
        return client_address;
    }

    public void setClient_address(String client_address) {
        this.client_address = client_address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Orders [id=" + id + ", client_name=" + client_name + ", client_address=" + client_address + ", email=" + email ;
    }

}