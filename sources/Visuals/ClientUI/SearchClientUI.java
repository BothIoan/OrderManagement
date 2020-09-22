package Visuals.ClientUI;
import Logic.Ref_Client;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Logic.Ref_Client;
import Logic.IntegerValidator;
import Logic.Ref_Client;
import Visuals.ErrorUI;

public class SearchClientUI extends JFrame{
    TextField T = new TextField(100);
    String[] choices =new String[]{"id","client_name","client_address","email"};
    final JComboBox cb =new JComboBox(choices);

    public SearchClientUI()
    {
        setSize(600, 600);
        setTitle("Search client");
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(3,1));
        final Ref_Client aux = new Ref_Client();
        final JTable table = aux.createTable(aux.findAll());
                T.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if(T.getText().isEmpty())
                {   DefaultTableModel model = (aux.updateTable(aux.findAll()));
                table.setModel(model);
                model.fireTableDataChanged();
                }
                else
                {
                    String auxText= new String("'"+T.getText()+"'");
                    DefaultTableModel model = (aux.updateTable(aux.find(cb.getSelectedItem().toString(),auxText)));
                    table.setModel(model);
                    model.fireTableDataChanged();
                }
            }
        });
        JScrollPane pane =new JScrollPane(table);
        add(pane);
        add(T);
        add(cb);
    }
}
