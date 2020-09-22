package Visuals;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Logic.Ref_Client;
import Logic.Ref_Item;
import Logic.Ref_Orders;
import Visuals.ClientUI.ManageClientsUI;
import Visuals.OrdersUI.ManageOrdersUI;
import Visuals.StorageUI.ManageStorageUI;

//ca idee o sa incerc sa am 3
public class MainUserInterface extends JFrame {
    JTable table;
    JScrollPane right;
    public MainUserInterface() {
        //probabil inutil in JFrame
        setSize(1000,1000);
        setTitle("MainFrame");
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        final Ref_Item auxI =new Ref_Item();
        final Ref_Client auxC =new Ref_Client();
        final Ref_Orders auxO =new Ref_Orders();
        //panels

        //left up panel
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 1;
        c.gridheight = 3;
        c.gridx = 0;
        c.gridy = 0;

        Panel leftUp = new Panel();
        leftUp.setFont(new Font("N", Font.BOLD, 20));
        leftUp.setLayout(new GridLayout(10, 1));
        Button manageClients = new Button("manage clients");
        Button manageStorage = new Button("manage storage");
        Button manageOrders = new Button("manage orders");

        leftUp.add(manageClients);
        leftUp.add(manageStorage);
        leftUp.add(manageOrders);

        add(leftUp,c);
        //

        //left down panel
        c.gridheight = 3 ;
        c.gridwidth = 1;
        c.gridx= 0;
        c.gridy= 3;

        Panel leftDown = new Panel();
        leftDown.setFont(new Font("M", Font.BOLD, 20));
        leftDown.setLayout(new GridLayout(3, 1));
        CheckboxGroup show = new CheckboxGroup();
        Checkbox shClients = new Checkbox("show clients",show,true);
        Checkbox shItems= new Checkbox("show storage",show,false);
        Checkbox shOrders= new Checkbox("show orders",show,false);


        leftDown.add(shClients);
        leftDown.add(shItems);
        leftDown.add(shOrders);
        //
        add(leftDown,c);
        //

        //right panel
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 6;
        c.gridheight = 6;
        c.gridx = 2;
        c.gridy = 0;
        table = auxC.createTable(auxC.findAll());
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(20);


        //Checkbox Logic
        shClients.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            DefaultTableModel tableModel =auxC.updateTable(auxC.findAll());
                table.setModel(tableModel);
                tableModel.fireTableDataChanged();
            }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) { }
            public void mouseExited(MouseEvent e) { }
        });
        shItems.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                DefaultTableModel tableModel =auxI.updateTable(auxI.findAll());
                table.setModel(tableModel);
                tableModel.fireTableDataChanged();
            }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) { }
            public void mouseExited(MouseEvent e) { }
        });
        shOrders.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                DefaultTableModel tableModel =auxO.updateTable(auxO.findAll());
                table.setModel(tableModel);
                tableModel.fireTableDataChanged();
            }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) { }
            public void mouseExited(MouseEvent e) { }
        });
        //
        manageClients.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ManageClientsUI();
            }
        });
        manageStorage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ManageStorageUI();
            }
        });

        manageOrders.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new ManageOrdersUI();
            }
        });

        right = new JScrollPane(table);
        right.setPreferredSize(new Dimension(800,800));
        add(right,c);




        //


    }


}
