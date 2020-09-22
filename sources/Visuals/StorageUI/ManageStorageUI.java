package Visuals.StorageUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageStorageUI extends JFrame {
    Button delete = new Button("delete item");
    Button add = new Button("add item");
    Button search = new Button("search item");
    Button edit = new Button("edit item");
    public ManageStorageUI(){
        setSize(200, 400);
        setTitle("Manage Storage");
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(4,1));
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DeleteItemUI();
            }
        });
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddItemUI();
            }
        });
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SearchItemUI();
            }
        });
        edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new editItemUI();
            }
        });
        add(add);
        add(delete);
        add(edit);
        add(search);
    }
}
