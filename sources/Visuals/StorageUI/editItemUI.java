package Visuals.StorageUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Logic.IntegerValidator;
import Logic.Ref_Item;
import Visuals.ErrorUI;
import java.util.ArrayList;
public class editItemUI extends JFrame
{
    Label idL = new Label("id");
    Label nameL = new Label("name");
    Label priceL = new Label("price");
    Label quantityL = new Label("quantity");
    TextField id = new TextField(50);
    TextField name = new TextField(50);
    TextField price = new TextField(50);
    TextField quantity = new TextField(50);
    Label S1 = new Label("select by");
    String[] choices =new String[]{"id","item_name","price","quantity"};
    final JComboBox cb =new JComboBox(choices);
    TextField T = new TextField(50);
    Button submit = new Button("Edit Item");

    public editItemUI()
    {
        setSize(500, 150);
        setTitle("Edit Item");
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(3, 4));

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> parameters=new ArrayList<String>();
                ArrayList<String> fields = new ArrayList<String>();
                if(!id.getText().isEmpty())
                    if(!IntegerValidator.isInteger(id.getText()))
                    {
                        new ErrorUI("id must be of type int !");
                        return;
                    }
                    else
                    {
                        parameters.add(id.getText());
                        fields.add("id");
                    }

                if(!name.getText().isEmpty())
                {
                    parameters.add("'" + name.getText() + "'");
                    fields.add("item_name");
                }
                if(!price.getText().isEmpty())
                    if(!IntegerValidator.isInteger(price.getText()))
                {
                    new ErrorUI("price must be of type int !");
                    return;
                }
                else
                {
                    parameters.add(price.getText());
                    fields.add("price");
                }
                if(!quantity.getText().isEmpty())
                    if(!IntegerValidator.isInteger(quantity.getText()))
                {
                    new ErrorUI("quantity must be of type int !");
                    return;
                }
                else
                {
                    parameters.add(quantity.getText());
                    fields.add("quantity");
                }
                Ref_Item aux = new Ref_Item();
                String [] aux2 = new String[parameters.size()];
                String [] aux3 =new String[fields.size()];
                parameters.toArray(aux2);
                fields.toArray(aux3);
                String aux4;
                if(cb.getSelectedItem().toString()=="item_name") {
                    aux4 ="'"+T.getText()+"'";
                }
                else
                {
                    if(!IntegerValidator.isInteger(T.getText()))
                    {
                        new ErrorUI("int fields can't take strings");
                        return;
                    }
                    aux4=T.getText();
                }
                aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
            }
        });
        id.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    ArrayList<String> parameters=new ArrayList<String>();
                    ArrayList<String> fields = new ArrayList<String>();
                    if(!id.getText().isEmpty())
                        if(!IntegerValidator.isInteger(id.getText()))
                        {
                            new ErrorUI("id must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(id.getText());
                            fields.add("id");
                        }

                    if(!name.getText().isEmpty())
                    {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("item_name");
                    }
                    if(!price.getText().isEmpty())
                        if(!IntegerValidator.isInteger(price.getText()))
                        {
                            new ErrorUI("price must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(price.getText());
                            fields.add("price");
                        }
                    if(!quantity.getText().isEmpty())
                        if(!IntegerValidator.isInteger(quantity.getText()))
                        {
                            new ErrorUI("quantity must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(quantity.getText());
                            fields.add("quantity");
                        }
                    Ref_Item aux = new Ref_Item();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
                    String aux4;
                    if(cb.getSelectedItem().toString()=="item_name") {
                        aux4 ="'"+T.getText()+"'";
                    }
                    else
                    {
                        if(!IntegerValidator.isInteger(T.getText()))
                        {
                            new ErrorUI("int fields can't take strings");
                            return;
                        }
                        aux4=T.getText();
                    }
                    aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
                }
            }
        });
        name.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {int count =4;
                    ArrayList<String> parameters=new ArrayList<String>();
                    ArrayList<String> fields = new ArrayList<String>();
                    if(!id.getText().isEmpty())
                        if(!IntegerValidator.isInteger(id.getText()))
                        {
                            new ErrorUI("id must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(id.getText());
                            fields.add("id");
                        }

                    if(!name.getText().isEmpty())
                    {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("item_name");
                    }
                    if(!price.getText().isEmpty())
                        if(!IntegerValidator.isInteger(price.getText()))
                        {
                            new ErrorUI("price must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(price.getText());
                            fields.add("price");
                        }
                    if(!quantity.getText().isEmpty())
                        if(!IntegerValidator.isInteger(quantity.getText()))
                        {
                            new ErrorUI("quantity must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(quantity.getText());
                            fields.add("quantity");
                        }
                    Ref_Item aux = new Ref_Item();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
                    String aux4;
                    if(cb.getSelectedItem().toString()=="item_name") {
                        aux4 ="'"+T.getText()+"'";
                    }
                    else
                    {
                        if(!IntegerValidator.isInteger(T.getText()))
                        {
                            new ErrorUI("int fields can't take strings");
                            return;
                        }
                        aux4=T.getText();
                    }
                    aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
                }
            }
        });
        price.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {int count =4;
                    ArrayList<String> parameters=new ArrayList<String>();
                    ArrayList<String> fields = new ArrayList<String>();
                    if(!id.getText().isEmpty())
                        if(!IntegerValidator.isInteger(id.getText()))
                        {
                            new ErrorUI("id must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(id.getText());
                            fields.add("id");
                        }

                    if(!name.getText().isEmpty())
                    {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("item_name");
                    }
                    if(!price.getText().isEmpty())
                        if(!IntegerValidator.isInteger(price.getText()))
                        {
                            new ErrorUI("price must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(price.getText());
                            fields.add("price");
                        }
                    if(!quantity.getText().isEmpty())
                        if(!IntegerValidator.isInteger(quantity.getText()))
                        {
                            new ErrorUI("quantity must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(quantity.getText());
                            fields.add("quantity");
                        }
                    Ref_Item aux = new Ref_Item();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
                    String aux4;
                    if(cb.getSelectedItem().toString()=="item_name") {
                        aux4 ="'"+T.getText()+"'";
                    }
                    else
                    {
                        if(!IntegerValidator.isInteger(T.getText()))
                        {
                            new ErrorUI("int fields can't take strings");
                            return;
                        }
                        aux4=T.getText();
                    }
                    aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
                }
            }
        });
        quantity.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {int count =4;
                    ArrayList<String> parameters=new ArrayList<String>();
                    ArrayList<String> fields = new ArrayList<String>();
                    if(!id.getText().isEmpty())
                        if(!IntegerValidator.isInteger(id.getText()))
                        {
                            new ErrorUI("id must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(id.getText());
                            fields.add("id");
                        }

                    if(!name.getText().isEmpty())
                    {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("item_name");
                    }
                    if(!price.getText().isEmpty())
                        if(!IntegerValidator.isInteger(price.getText()))
                        {
                            new ErrorUI("price must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(price.getText());
                            fields.add("price");
                        }
                    if(!quantity.getText().isEmpty())
                        if(!IntegerValidator.isInteger(quantity.getText()))
                        {
                            new ErrorUI("quantity must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(quantity.getText());
                            fields.add("quantity");
                        }
                    Ref_Item aux = new Ref_Item();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
                    String aux4;
                    if(cb.getSelectedItem().toString()=="item_name") {
                        aux4 ="'"+T.getText()+"'";
                    }
                    else
                    {
                        if(!IntegerValidator.isInteger(T.getText()))
                        {
                            new ErrorUI("int fields can't take strings");
                            return;
                        }
                        aux4=T.getText();
                    }
                    aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
                }
            }
        });
        T.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {int count =4;
                    ArrayList<String> parameters=new ArrayList<String>();
                    ArrayList<String> fields = new ArrayList<String>();
                    if(!id.getText().isEmpty())
                        if(!IntegerValidator.isInteger(id.getText()))
                        {
                            new ErrorUI("id must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(id.getText());
                            fields.add("id");
                        }

                    if(!name.getText().isEmpty())
                    {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("item_name");
                    }
                    if(!price.getText().isEmpty())
                        if(!IntegerValidator.isInteger(price.getText()))
                        {
                            new ErrorUI("price must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(price.getText());
                            fields.add("price");
                        }
                    if(!quantity.getText().isEmpty())
                        if(!IntegerValidator.isInteger(quantity.getText()))
                        {
                            new ErrorUI("quantity must be of type int !");
                            return;
                        }
                        else
                        {
                            parameters.add(quantity.getText());
                            fields.add("quantity");
                        }
                    Ref_Item aux = new Ref_Item();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    String aux4;
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
                    if(cb.getSelectedItem().toString()=="item_name") {
                        aux4 ="'"+T.getText()+"'";
                    }
                    else
                    {
                        if(!IntegerValidator.isInteger(T.getText()))
                        {
                            new ErrorUI("int fields can't take strings");
                            return;
                        }
                        aux4=T.getText();
                    }
                    aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
                }
            }
        });

        add(idL);
        add(nameL);
        add(priceL);
        add(quantityL);
        add(id);
        add(name);
        add(price);
        add(quantity);
        add(S1);
        add(cb);
        add(T);
        add(submit);

    }
}