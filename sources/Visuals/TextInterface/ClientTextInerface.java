package Visuals.TextInterface;

import Logic.Ref_Client;

public class ClientTextInerface {

    public static void addClient(String input) {
        String[] strings = input.split(",");
        Ref_Client ref_client = new Ref_Client();
        ref_client.insert(new String[]{Integer.toString(ref_client.findMaxId()+1), "'" + strings[0] + "'", "'" + strings[1] + "'", "'ONLY_FOR_UI_BASED_ENTRIES'"});
        //aux.insert(new String[]{id.getText(),"'"+name.getText()+"'","'"+address.getText()+"'","'"+mail.getText()+"'"});
    }

    public static void deleteClient (String input){
        Ref_Client ref_client = new Ref_Client();
        ref_client.delete("client_name","'"+input+"'");
    }
}