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


public class AddItemUI extends JFrame {
    Label idL = new Label("id");
    Label nameL = new Label("name");
    Label priceL= new Label("price");
    Label quantityL = new Label("quantity");
    TextField id = new TextField(50);
    TextField name=new TextField(50);
    TextField price= new TextField(50);
    TextField quantity = new TextField(50);
    Label S1 = new Label("");
    Label S2 = new Label("");
    Label S3 = new Label("");
    Button submit = new Button("Add Item");
    public AddItemUI()
    {
        setSize(500, 150);
        setTitle("Add new item");
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(3,4));

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!IntegerValidator.isInteger(id.getText()))
                {
                    new ErrorUI("id must be of type int !");
                    return;
                }
                if(!IntegerValidator.isInteger(price.getText()))
                {
                    new ErrorUI("price must be of type int !");
                    return;
                }
                if(!IntegerValidator.isInteger(quantity.getText()))
                {
                    new ErrorUI("quantity must be of type int !");
                    return;
                }
                Ref_Item aux = new Ref_Item();
                aux.insert(new String[]{id.getText(),"'"+name.getText()+"'",price.getText(),quantity.getText()});
            }
        });
        id.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                { if(!IntegerValidator.isInteger(id.getText()))
                    {
                    new ErrorUI("id must be of type int !");
                    return;}

                    if(!IntegerValidator.isInteger(price.getText()))
                    {
                        new ErrorUI("price must be of type int !");
                        return;
                    }
                    if(!IntegerValidator.isInteger(quantity.getText()))
                    {
                        new ErrorUI("quantity must be of type int !");
                        return;
                    }
                    Ref_Item aux = new Ref_Item();
                    aux.insert(new String[]{id.getText(),"'"+name.getText()+"'",price.getText(),quantity.getText()});
                }
            }
        });
        name.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                { if(!IntegerValidator.isInteger(id.getText()))
                    {
                    new ErrorUI("id must be of type int !");
                    return;}

                    if(!IntegerValidator.isInteger(price.getText()))
                    {
                        new ErrorUI("price must be of type int !");
                        return;
                    }
                    if(!IntegerValidator.isInteger(quantity.getText()))
                    {
                        new ErrorUI("quantity must be of type int !");
                        return;
                    }
                    Ref_Item aux = new Ref_Item();
                    aux.insert(new String[]{id.getText(),"'"+name.getText()+"'",price.getText(),quantity.getText()});
                }
            }
        });
        price.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                { if(!IntegerValidator.isInteger(id.getText()))
                {
                    new ErrorUI("id must be of type int !");
                    return;}

                    if(!IntegerValidator.isInteger(price.getText()))
                    {
                        new ErrorUI("price must be of type int !");
                        return;
                    }
                    if(!IntegerValidator.isInteger(quantity.getText()))
                    {
                        new ErrorUI("quantity must be of type int !");
                        return;
                    }
                    Ref_Item aux = new Ref_Item();
                    aux.insert(new String[]{id.getText(),"'"+name.getText()+"'",price.getText(),quantity.getText()});
                }
            }
        });
        quantity.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                { if(!IntegerValidator.isInteger(id.getText()))
                {
                    new ErrorUI("id must be of type int !");
                    return;}

                    if(!IntegerValidator.isInteger(price.getText()))
                    {
                        new ErrorUI("price must be of type int !");
                        return;
                    }
                    if(!IntegerValidator.isInteger(quantity.getText()))
                    {
                        new ErrorUI("quantity must be of type int !");
                        return;
                    }
                    Ref_Item aux = new Ref_Item();
                    aux.insert(new String[]{id.getText(),"'"+name.getText()+"'",price.getText(),quantity.getText()});
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
        add(S2);
        add(S3);
        add(submit);
    }
}
