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

public class DeleteItemUI extends JFrame{
    Label L = new Label("search by:");
    Label L2= new Label("identifier");
    String[] choices =new String[]{"id","item_name","price","quantity"};
    TextField T = new TextField(50);
    Label S1 = new Label("");
    Label S2 = new Label("");
    Label S3 = new Label("");
    Label S4= new Label("");
    Button submit = new Button("Delete Item");
    public DeleteItemUI()
    {
        setSize(500, 150);
        setTitle("Delete item");
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(3,4));
        final JComboBox cb =new JComboBox(choices);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String aux2;
                if(cb.getSelectedItem().toString()=="name") {
                    aux2 ="'"+T.getText()+"'";
                }
                else
                {
                    if(!IntegerValidator.isInteger(T.getText()))
                    {
                        new ErrorUI("int fields can't take strings");
                        return;
                    }
                    aux2=T.getText();
                }
                Ref_Item aux = new Ref_Item();
                aux.delete(cb.getSelectedItem().toString(),aux2);
            }
        });
        T.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    String aux2;
                    if(cb.getSelectedItem().toString()=="name") {
                        aux2 ="'"+T.getText()+"'";
                    }
                    else
                    {
                        if(!IntegerValidator.isInteger(T.getText()))
                        {
                            new ErrorUI("int fields can't take strings");
                            return;
                        }
                        aux2=T.getText();
                    }
                    Ref_Item aux = new Ref_Item();
                    aux.delete(cb.getSelectedItem().toString(),aux2);
                }
            }
        });
        add(L);
        add(L2);
        add(S1);
        add(cb);
        add(T);
        add(S2);
        add(S3);
        add(S4);
        add(submit);

    }
}
