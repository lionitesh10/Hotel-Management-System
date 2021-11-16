package Views.Guests;

import Views.style.GradientStyle;

import javax.swing.*;
import java.awt.*;

public class GuestLists {
    public GuestLists(){
        JFrame roomAvailableFrame=new JFrame("Sajilo Hotel | Guest Lists ");
        roomAvailableFrame.setVisible(true);
        roomAvailableFrame.setSize(800,600);
        roomAvailableFrame.setDefaultCloseOperation(1);

        GradientStyle sPanel= new GradientStyle();

        roomAvailableFrame.getContentPane().add(sPanel);
        sPanel.setBounds(0,0,800,600);

        JPanel headerPanel=new JPanel();
        headerPanel.setBounds(0,0,800,100);
        headerPanel.setOpaque(false);
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        sPanel.add(headerPanel);

        JLabel guestListsLabel=new JLabel("<html><font size='5'color=white>Guest Lists : </font></html>");
        guestListsLabel.setFont(new Font("Verdana", Font.PLAIN,5));
        headerPanel.add(guestListsLabel);

        JPanel guestListsPanel=new JPanel();
        guestListsPanel.setBounds(25,50,725,550);
        guestListsPanel.setLayout(new BoxLayout (guestListsPanel, BoxLayout.Y_AXIS));
        sPanel.add(guestListsPanel);
        guestListsPanel.setBackground(Color.decode("#cfd8dc"));

        JLabel guestColumns=new JLabel("\t     S.N     \t     Room No. \t     Floor \t    Category \t    Guest Name \t Actions");
        guestListsPanel.add(guestColumns);

    }
}
