package Visuals.TextInterface;

import Logic.Ref_Client;
import Logic.Ref_Item;

public class ItemTextInterface {
    public static void addItem(String input) {
        String[] strings = input.split(",");
        Ref_Item ref_item = new Ref_Item();
        ref_item.insert(new String[]{Integer.toString(ref_item.findMaxId()+1), "'" + strings[0] + "'", "'" + strings[2] + "'", "'"+strings[1]+"'"});
        //aux.insert(new String[]{id.getText(),"'"+name.getText()+"'",price.getText(),quantity.getText()});
    }

    public static void deleteItem (String input){
        Ref_Item ref_item = new Ref_Item();
        ref_item.delete("item_name","'"+input+"'");
    }
}
