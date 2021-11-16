package Views.roommanagement;

import Views.style.GradientStyle;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class RoomDetails {
    public RoomDetails() {
        JFrame roomDetailFrame=new JFrame("Sajilo Hotel | Room Detail ");
        roomDetailFrame.setVisible(true);
        roomDetailFrame.setSize(800,600);
        roomDetailFrame.setDefaultCloseOperation(1);

        GradientStyle sPanel= new GradientStyle();

        roomDetailFrame.getContentPane().add(sPanel);
        sPanel.setBounds(0,0,800,600);

        JPanel headerPanel=new JPanel();
        headerPanel.setBounds(0,0,800,100);
        headerPanel.setOpaque(false);
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        sPanel.add(headerPanel);

        JLabel roomDetailLabel=new JLabel("<html><font size='5'color=white>Room Details : </font></html>");
        roomDetailLabel.setFont(new Font("Verdana", Font.PLAIN,5));
        headerPanel.add(roomDetailLabel);

        JPanel roomDetailPanel=new JPanel();
        roomDetailPanel.setBounds(25,50,725,550);
        roomDetailPanel.setLayout(new BoxLayout (roomDetailPanel, BoxLayout.Y_AXIS));
        sPanel.add(roomDetailPanel);
        roomDetailPanel.setBackground(Color.decode("#cfd8dc"));

        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));
        JLabel roomNoLabel=new JLabel("Room No : "+"101");
        roomNoLabel.setFont(new Font("Verdana", Font.PLAIN,20));

        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        JLabel roomCategoryLabel=new JLabel("Room Category : "+"Super Deluxe");
        roomCategoryLabel.setFont(new Font("Verdana",Font.PLAIN,20));

        JLabel roomFloorLabel=new JLabel("Floor : "+"First Floor");
        roomFloorLabel.setFont(new Font("Verdana",Font.PLAIN,20));

        JLabel specialAttributeLabel=new JLabel("Special Attribute : "+"Sunset View");
        specialAttributeLabel.setFont(new Font("Verdana",Font.PLAIN,20));

        JLabel chargePerDayLabel=new JLabel("Charge Per Day : Rs."+"2000");
        chargePerDayLabel.setFont(new Font("Verdana",Font.PLAIN,20));


        JLabel roomTypeLabel=new JLabel("Room Type : "+"Couple");
        roomTypeLabel.setFont(new Font("Verdana",Font.PLAIN,20));

        JLabel roomUsername=new JLabel("Username : "+"sH101");
        roomUsername.setFont(new Font("Verdana",Font.PLAIN,20));

        JLabel roomPassword=new JLabel("Password : "+"abcd1234@#%");
        roomPassword.setFont(new Font("Verdana",Font.PLAIN,20));

        Icon roomImage=new ImageIcon(new ImageIcon("./images/rooms/room101.jpg").getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT));
        JLabel roomImagePic=new JLabel(roomImage);

        roomDetailPanel.add(roomNoLabel);
        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));
        roomDetailPanel.add(roomCategoryLabel);
        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));
        roomDetailPanel.add(roomFloorLabel);
        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));
        roomDetailPanel.add(roomTypeLabel);
        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));
        roomDetailPanel.add(specialAttributeLabel);
        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));
        roomDetailPanel.add(chargePerDayLabel);
        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));
        roomDetailPanel.add(roomUsername);
        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));
        roomDetailPanel.add(roomPassword);
        roomDetailPanel.add(Box.createRigidArea(new Dimension(5, 15)));
        roomDetailPanel.add(roomImagePic);

    }
}
