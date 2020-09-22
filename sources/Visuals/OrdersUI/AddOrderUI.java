package Visuals.OrdersUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Logic.IntegerValidator;
import Logic.Ref_Orders;
import Visuals.ErrorUI;


public class AddOrderUI extends JFrame {
    Label idL = new Label("id");
    Label client_idL = new Label("client_id");
    Label product_idL= new Label("product_id");
    Label orderQuantityL = new Label("orderQuantity");
    TextField id = new TextField(50);
    TextField client_id=new TextField(50);
    TextField product_id= new TextField(50);
    TextField orderQuantity = new TextField(50);
    Label S1 = new Label("");
    Label S2 = new Label("");
    Label S3 = new Label("");
    Button submit = new Button("Create Order");
    public AddOrderUI()
    {
        setSize(500, 150);
        setTitle("Create Order");
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
                if(!IntegerValidator.isInteger(client_id.getText()))
                {
                    new ErrorUI("price must be of type int !");
                    return;
                }
                if(!IntegerValidator.isInteger(orderQuantity.getText()))
                {
                    new ErrorUI("quantity must be of type int !");
                    return;
                }
                Ref_Orders aux = new Ref_Orders();
                aux.insert(new String[]{id.getText(),client_id.getText(),product_id.getText(),orderQuantity.getText()});
            }
        });
        id.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {     if(!IntegerValidator.isInteger(id.getText()))
                {
                    new ErrorUI("id must be of type int !");
                    return;
                }
                    if(!IntegerValidator.isInteger(client_id.getText()))
                    {
                        new ErrorUI("price must be of type int !");
                        return;
                    }
                    if(!IntegerValidator.isInteger(orderQuantity.getText()))
                    {
                        new ErrorUI("quantity must be of type int !");
                        return;
                    }
                    Ref_Orders aux = new Ref_Orders();
                    aux.insert(new String[]{id.getText(),client_id.getText(),product_id.getText(),orderQuantity.getText()});
                }
            }
        });
        orderQuantity.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {     if(!IntegerValidator.isInteger(id.getText()))
                {
                    new ErrorUI("id must be of type int !");
                    return;
                }
                    if(!IntegerValidator.isInteger(client_id.getText()))
                    {
                        new ErrorUI("price must be of type int !");
                        return;
                    }
                    if(!IntegerValidator.isInteger(orderQuantity.getText()))
                    {
                        new ErrorUI("quantity must be of type int !");
                        return;
                    }
                    Ref_Orders aux = new Ref_Orders();
                    aux.insert(new String[]{id.getText(),client_id.getText(),product_id.getText(),orderQuantity.getText()});
                }
            }
        });
        product_id.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {     if(!IntegerValidator.isInteger(id.getText()))
                {
                    new ErrorUI("id must be of type int !");
                    return;
                }
                    if(!IntegerValidator.isInteger(client_id.getText()))
                    {
                        new ErrorUI("price must be of type int !");
                        return;
                    }
                    if(!IntegerValidator.isInteger(orderQuantity.getText()))
                    {
                        new ErrorUI("quantity must be of type int !");
                        return;
                    }
                    Ref_Orders aux = new Ref_Orders();
                    aux.insert(new String[]{id.getText(),client_id.getText(),product_id.getText(),orderQuantity.getText()});
                }
            }
        });
        orderQuantity.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {     if(!IntegerValidator.isInteger(id.getText()))
                {
                    new ErrorUI("id must be of type int !");
                    return;
                }
                    if(!IntegerValidator.isInteger(client_id.getText()))
                    {
                        new ErrorUI("price must be of type int !");
                        return;
                    }
                    if(!IntegerValidator.isInteger(orderQuantity.getText()))
                    {
                        new ErrorUI("quantity must be of type int !");
                        return;
                    }
                    Ref_Orders aux = new Ref_Orders();
                    aux.insert(new String[]{id.getText(),client_id.getText(),product_id.getText(),orderQuantity.getText()});
                }
            }
        });
        add(idL);
        add(client_idL);
        add(product_idL);
        add(orderQuantityL);
        add(id);
        add(client_id);
        add(product_id);
        add(orderQuantity);
        add(S1);
        add(S2);
        add(S3);
        add(submit);
    }
}

