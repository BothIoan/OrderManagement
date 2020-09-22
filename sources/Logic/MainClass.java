package Logic;

import Models.Client;
import Visuals.ErrorUI;
import Visuals.MainUserInterface;
import Visuals.TextInterface.*;
import com.itextpdf.text.DocumentException;

import java.io.*;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("press 1 for UI , press 2 for text based");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c == 1) {
            MainUserInterface mainUserInterface = new MainUserInterface();
        }
        else{
            String currentText;
            try{
                File file = new File(args[0]);
                BufferedReader reader = null;
                reader = new BufferedReader(new FileReader(file));
        while((currentText =reader.readLine())!= null){
            String[] aux = currentText.split(":");
            switch (aux[0]){
                case "Insert client":
                    ClientTextInerface.addClient(aux[1]);
                    break;
                case "Delete client":
                    ClientTextInerface.deleteClient(aux[1]);
                    break;
                case "Insert product":
                    ItemTextInterface.addItem(aux[1]);
                    break;
                case "Delete product":
                    ItemTextInterface.deleteItem(aux[1]);
                    break;
                case"Order":
                    OrderTextInterface.addOrder(aux[1]);
                    break;
                default:
                    String[] aux2 = aux[0].split(" ");
                    if(aux2[0].equals("Report")){
                        if(aux2.length!=2){
                            new ErrorUI(currentText + "is not a valid command");
                            return;
                        }
                        ReportsText.getReport(aux2[1]);
                    }
                    else
                        new ErrorUI(currentText + "is not a valid command");
                    break;
            }
        }
            }catch (IOException | DocumentException ignored){}
        }
    }
}
