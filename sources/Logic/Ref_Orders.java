package Logic;
import Visuals.ErrorUI;
import Models.Orders;
import Visuals.TextInterface.ReportsText;
import com.itextpdf.text.DocumentException;

import java.io.*;

public class Ref_Orders extends  ForReflection<Orders> {
public void insert(String[] parameters){
    Ref_Client auxC =new Ref_Client();
    Ref_Item auxI=new Ref_Item();
    if(auxC.strictFind("id",parameters[1])==null) {
        new ErrorUI("not a valid Id1");
        return;
    }
    if(auxI.strictFind("id",parameters[2])==null) {
        new ErrorUI("not a valid Id1");
        return;
    }
    Object aux = auxI.getrows(auxI.strictFind("id",parameters[2]))[0][3];


    int dif =Integer.parseInt(aux.toString())-Integer.parseInt(parameters[3]);
    if (dif>=0) {
        super.insert(parameters);
        auxI.edit(new String[]{"quantity"},new String[]{"" + dif},"id",parameters[2]);
        Object name = auxC.getrows(auxC.strictFind("id",parameters[1]))[0][1];
        Object product=auxI.getrows(auxI.strictFind("id",parameters[2]))[0][1];
        Object price=auxI.getrows(auxI.strictFind("id",parameters[2]))[0][2];

        try {
            File file = new File("bill.txt");
            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("        Bill          ");
            pw.println("Buyer: "+name.toString());
            pw.println("Product: "+product.toString());
            pw.println("Cost"+(Integer.parseInt(aux.toString())*Integer.parseInt(price.toString())));
            pw.close();
            StringBuilder sb = new StringBuilder();
            sb.append("        Bill          ~");
            sb.append("~Buyer: "+name.toString());
            sb.append("~Product: "+product.toString());
            sb.append("~Cost:"+(Integer.parseInt(aux.toString())*Integer.parseInt(price.toString())));
            sb.append("~Quantity:"+parameters[3]);
            ReportsText.createBill(sb.toString());
            System.out.println("Printed");
        }
        catch (Exception e)
        {e.printStackTrace();}
    }
    else
    {
        new ErrorUI("not enough quantity");
        try {
            ReportsText.createBill("not enough quantity");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException ignored) { }
        return;
    }
}
}
