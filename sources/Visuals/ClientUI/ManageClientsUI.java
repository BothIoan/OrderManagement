package Visuals.ClientUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageClientsUI extends JFrame {
 Button delete = new Button("delete client");
 Button add = new Button("add client");
 Button search = new Button("search client");
 Button edit = new Button("edit client");
 public ManageClientsUI(){
     setSize(200, 400);
     setTitle("Manage clients");
     setLocationRelativeTo(null);
     setVisible(true);
     setLayout(new GridLayout(4,1));
     delete.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             new DeleteClientUI();
         }
     });
     add.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             new AddClientUI();
         }
     });
     search.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             new SearchClientUI();
         }
     });
     edit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             new EditClientsUI();
         }
     });
     add(add);
     add(delete);
     add(edit);
     add(search);
 }
}
