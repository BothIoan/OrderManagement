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
import java.util.ArrayList;
public class EditClientsUI extends JFrame{
    Label idL = new Label("id");
    Label nameL = new Label("name");
    Label addressL = new Label("address");
    Label mailL = new Label("Mail");
    TextField id = new TextField(50);
    TextField name = new TextField(50);
    TextField address = new TextField(50);
    TextField mail = new TextField(50);
    Label S1 = new Label("select by");
    String[] choices =new String[]{"id","client_name","client_address","email"};
    final JComboBox cb =new JComboBox(choices);
    TextField T = new TextField(50);
    Button submit = new Button("Edit Client");

    public EditClientsUI()
    {
        setSize(500, 150);
        setTitle("Edit client");
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(3, 4));

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count =4;
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

                if(!name.getText().isEmpty()) {
                    parameters.add("'" + name.getText() + "'");
                    fields.add("client_name");
                }
                if(!address.getText().isEmpty()) {
                    parameters.add("'" + address.getText() + "'");
                    fields.add("client_address");
                }
                if(!mail.getText().isEmpty()) {
                    parameters.add("'" + mail.getText() + "'");
                    fields.add("email");
                }
                Ref_Client aux = new Ref_Client();
                String [] aux2 = new String[parameters.size()];
                String [] aux3 =new String[fields.size()];
                String aux4;
                if(cb.getSelectedItem().toString()=="id") {
                    if (!IntegerValidator.isInteger(T.getText())) {
                        new ErrorUI("Id must be int!");
                        return;
                    }
                    aux4= T.getText();
                }else { aux4= "'"+T.getText()+"'";}
                parameters.toArray(aux2);
                fields.toArray(aux3);
                aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
            }
        });
        id.addKeyListener(new KeyListener() {
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

                    if(!name.getText().isEmpty()) {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("client_name");
                    }
                    if(!address.getText().isEmpty()) {
                        parameters.add("'" + address.getText() + "'");
                        fields.add("client_address");
                    }
                    if(!mail.getText().isEmpty()) {
                        parameters.add("'" + mail.getText() + "'");
                        fields.add("email");
                    }
                    Ref_Client aux = new Ref_Client();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    String aux4;
                    if(cb.getSelectedItem().toString()=="id") {
                        if (!IntegerValidator.isInteger(T.getText())) {
                            new ErrorUI("Id must be int!");
                            return;
                        }
                        aux4= T.getText();
                    }else { aux4= "'"+T.getText()+"'";}
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
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

                    if(!name.getText().isEmpty()) {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("client_name");
                    }
                    if(!address.getText().isEmpty()) {
                        parameters.add("'" + address.getText() + "'");
                        fields.add("client_address");
                    }
                    if(!mail.getText().isEmpty()) {
                        parameters.add("'" + mail.getText() + "'");
                        fields.add("email");
                    }
                    Ref_Client aux = new Ref_Client();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    String aux4;
                    if(cb.getSelectedItem().toString()=="id") {
                        if (!IntegerValidator.isInteger(T.getText())) {
                            new ErrorUI("Id must be int!");
                            return;
                        }
                        aux4= T.getText();
                    }else { aux4= "'"+T.getText()+"'";}
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
                    aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
                }
            }
        });
        address.addKeyListener(new KeyListener() {
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

                    if(!name.getText().isEmpty()) {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("client_name");
                    }
                    if(!address.getText().isEmpty()) {
                        parameters.add("'" + address.getText() + "'");
                        fields.add("client_address");
                    }
                    if(!mail.getText().isEmpty()) {
                        parameters.add("'" + mail.getText() + "'");
                        fields.add("email");
                    }
                    Ref_Client aux = new Ref_Client();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    String aux4;
                    if(cb.getSelectedItem().toString()=="id") {
                        if (!IntegerValidator.isInteger(T.getText())) {
                            new ErrorUI("Id must be int!");
                            return;
                        }
                        aux4= T.getText();
                    }else { aux4= "'"+T.getText()+"'";}
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
                    aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
                }
            }
        });
        mail.addKeyListener(new KeyListener() {
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

                    if(!name.getText().isEmpty()) {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("client_name");
                    }
                    if(!address.getText().isEmpty()) {
                        parameters.add("'" + address.getText() + "'");
                        fields.add("client_address");
                    }
                    if(!mail.getText().isEmpty()) {
                        parameters.add("'" + mail.getText() + "'");
                        fields.add("email");
                    }
                    Ref_Client aux = new Ref_Client();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    String aux4;
                    if(cb.getSelectedItem().toString()=="id") {
                        if (!IntegerValidator.isInteger(T.getText())) {
                            new ErrorUI("Id must be int!");
                            return;
                        }
                        aux4= T.getText();
                    }else { aux4= "'"+T.getText()+"'";}
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
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

                    if(!name.getText().isEmpty()) {
                        parameters.add("'" + name.getText() + "'");
                        fields.add("client_name");
                    }
                    if(!address.getText().isEmpty()) {
                        parameters.add("'" + address.getText() + "'");
                        fields.add("client_address");
                    }
                    if(!mail.getText().isEmpty()) {
                        parameters.add("'" + mail.getText() + "'");
                        fields.add("email");
                    }
                    Ref_Client aux = new Ref_Client();
                    String [] aux2 = new String[parameters.size()];
                    String [] aux3 =new String[fields.size()];
                    String aux4;
                    if(cb.getSelectedItem().toString()=="id") {
                        if (!IntegerValidator.isInteger(T.getText())) {
                            new ErrorUI("Id must be int!");
                            return;
                        }
                        aux4= T.getText();
                    }else { aux4= "'"+T.getText()+"'";}
                    parameters.toArray(aux2);
                    fields.toArray(aux3);
                    aux.edit(aux3,aux2,cb.getSelectedItem().toString(),aux4);
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
        add(cb);
        add(T);
        add(submit);

    }
}