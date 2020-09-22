package Visuals.TextInterface;

import Logic.Ref_Client;
import Logic.Ref_Item;
import Logic.Ref_Orders;
import Models.Client;
import Models.Item;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 */
public class OrderTextInterface {
    /**
     * @param input
     */
    public static void addOrder(String input) throws FileNotFoundException, DocumentException {
        String[] strings = input.split(",");
        Ref_Orders ref_order = new Ref_Orders();
        Ref_Client ref_client= new Ref_Client();
        Ref_Item ref_item= new Ref_Item();
        List<Item> items =ref_item.strictFind("item_name","'"+strings[1]+"'");
        List<Client> clients = ref_client.strictFind("client_name","'"+strings[0]+"'");
        int clientid = clients.get(0).getId();
        int productid = items.get(0).getId();
        ref_order.insert(new String[]{Integer.toString(ref_order.findMaxId()+1), Integer.toString(clientid), Integer.toString(productid),strings[2].substring(1)});
        //aux.insert(new String[]{id.getText(),client_id.getText(),product_id.getText(),orderQuantity.getText()});
        //clientName,productName,Quantity
    }
}
