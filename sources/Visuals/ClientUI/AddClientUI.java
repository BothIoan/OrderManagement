package Visuals.ClientUI;
import Logic.Ref_Client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Logic.IntegerValidator;
import Visuals.ErrorUI;


public class AddClientUI extends JFrame {
    Label idL = new Label("id");
    Label nameL = new Label("name");
    Label addressL= new Label("address");
    Label mailL = new Label("Mail");
    TextField id = new TextField(50);
    TextField name=new TextField(50);
    TextField address= new TextField(50);
    TextField mail = new TextField(50);
    Label S1 = new Label("");
    Label S2 = new Label("");
    Label S3 = new Label("");
    Button submit = new Button("Add Client");
    public AddClientUI()
    {
        setSize(500, 150);
        setTitle("Add new client");
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
                Ref_Client aux = new Ref_Client();
                aux.insert(new String[]{id.getText(),"'"+name.getText()+"'","'"+address.getText()+"'","'"+mail.getText()+"'"});
            }
        });
        id.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    if(!IntegerValidator.isInteger(id.getText()))
                    {
                        new ErrorUI("id must be of type int !");
                        return;
                    }
                    Ref_Client aux = new Ref_Client();
                    aux.insert(new String[]{id.getText(),"'"+name.getText()+"'","'"+address.getText()+"'","'"+mail.getText()+"'"});
                }
            }
        });
        name.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    if(!IntegerValidator.isInteger(id.getText()))
                    {
                        new ErrorUI("id must be of type int !");
                        return;
                    }
                    Ref_Client aux = new Ref_Client();
                    aux.insert(new String[]{id.getText(),"'"+name.getText()+"'","'"+address.getText()+"'","'"+mail.getText()+"'"});
                }
            }
        });
        address.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    if(!IntegerValidator.isInteger(id.getText()))
                    {
                        new ErrorUI("id must be of type int !");
                        return;
                    }
                    Ref_Client aux = new Ref_Client();
                    aux.insert(new String[]{id.getText(),"'"+name.getText()+"'","'"+address.getText()+"'","'"+mail.getText()+"'"});
                }
            }
        });
        mail.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    if(!IntegerValidator.isInteger(id.getText()))
                    {
                        new ErrorUI("id must be of type int !");
                        return;
                    }
                    Ref_Client aux = new Ref_Client();
                    aux.insert(new String[]{id.getText(),"'"+name.getText()+"'","'"+address.getText()+"'","'"+mail.getText()+"'"});
                }
            }
        });
        add(idL);
        add(nameL);
        add(addressL);
        add(mailL);
        add(id);
        add(name);
        add(address);
        add(mail);
        add(S1);
        add(S2);
        add(S3);
        add(submit);
    }
}
