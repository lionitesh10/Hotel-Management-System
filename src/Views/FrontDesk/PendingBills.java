package Views.FrontDesk;

import Views.style.GradientStyle;

import javax.swing.*;
import java.awt.*;

public class PendingBills {
    public PendingBills(){
        JFrame pendingBillsFrame=new JFrame("Sajilo Hotel | Pending Bills ");
        pendingBillsFrame.setVisible(true);
        pendingBillsFrame.setSize(800,600);
        pendingBillsFrame.setDefaultCloseOperation(1);

        GradientStyle sPanel= new GradientStyle();

        pendingBillsFrame.getContentPane().add(sPanel);
        sPanel.setBounds(0,0,800,600);

        JPanel headerPanel=new JPanel();
        headerPanel.setBounds(0,0,800,100);
        headerPanel.setOpaque(false);
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        sPanel.add(headerPanel);

        JLabel pendingBillsLabel=new JLabel("<html><font size='5'color=white>Pending Bills : </font></html>");
        pendingBillsLabel.setFont(new Font("Verdana", Font.PLAIN,5));
        headerPanel.add(pendingBillsLabel);

        JPanel pendingBillsPanel=new JPanel();
        pendingBillsPanel.setBounds(25,50,725,550);
        sPanel.add(pendingBillsPanel);
        pendingBillsPanel.setBackground(Color.decode("#cfd8dc"));

        JLabel roomNoLabel=new JLabel("Room No : ");
        roomNoLabel.setBounds(10,10,100,25);
        pendingBillsPanel.add(roomNoLabel);

        String roomNos[]={"101","201","301","401"};
        JComboBox roomNoCombo=new JComboBox(roomNos);
        roomNoCombo.setBounds(110,10,100,25);
        pendingBillsPanel.add(roomNoCombo);

        // Data to be displayed in the JTable
        String[][] data = {
                { "Deluxe Room - Single ", "1", "1200","1200" },
                { "Single Room - Basic ", "2", "600" ,"1200"},
                { "", "", "Total" ,"2400"}
        };

        // Column Names
        String[] columnNames = { "Item", "Quantity", "Rate","Total" };

        // Initializing the JTable
        JTable j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        pendingBillsPanel.add(sp);

        JButton checkOutBtn=new JButton("CheckOut");
        checkOutBtn.setBounds(10,450,100,25);
        pendingBillsPanel.add(checkOutBtn);
    }
}
