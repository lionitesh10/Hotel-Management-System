package Views.roommanagement;

import Views.style.GradientStyle;

import javax.swing.*;
import java.awt.*;

public class RoomsAvailableList {
    public RoomsAvailableList(){
        JFrame roomAvailableFrame=new JFrame("Sajilo Hotel | Available Rooms ");
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

        JLabel roomDetailLabel=new JLabel("<html><font size='5'color=white>Available Rooms : </font></html>");
        roomDetailLabel.setFont(new Font("Verdana", Font.PLAIN,5));
        headerPanel.add(roomDetailLabel);

        JPanel roomDetailPanel=new JPanel();
        roomDetailPanel.setBounds(25,50,725,550);
        roomDetailPanel.setLayout(new BoxLayout (roomDetailPanel, BoxLayout.Y_AXIS));
        sPanel.add(roomDetailPanel);
        roomDetailPanel.setBackground(Color.decode("#cfd8dc"));

        JLabel roomColumns=new JLabel("\t     S.N     \t     Room No. \t     Floor \t    Category \t    Type \t Actions");
        roomDetailPanel.add(roomColumns);





    }
}
