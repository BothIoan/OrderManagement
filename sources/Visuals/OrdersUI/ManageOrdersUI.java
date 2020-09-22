package Visuals.OrdersUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ManageOrdersUI extends JFrame {
    Button delete = new Button("delete Order");
    Button add = new Button("add Order");
    public ManageOrdersUI(){
        setSize(100, 200);
        setTitle("Manage Orders");
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(2,1));
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DeleteOrderUI();
            }
        });
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddOrderUI();
            }
        });
        add(add);
        add(delete);
    }
}
