package Views.Reservations;

import Views.style.GradientStyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateReservation {
    public CreateReservation(){
        JFrame guestCreateFrame = new JFrame("Sajilo Hotel | Create Reservation ");
        guestCreateFrame.setVisible(true);
        guestCreateFrame.setSize(800, 600);
        guestCreateFrame.setDefaultCloseOperation(1);

        GradientStyle sPanel = new GradientStyle();

        guestCreateFrame.getContentPane().add(sPanel);
        sPanel.setBounds(0, 0, 800, 600);

        JPanel headerPanel = new JPanel();
        headerPanel.setBounds(0, 0, 800, 100);
        headerPanel.setOpaque(false);
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        sPanel.add(headerPanel);

        JLabel roomCreateLabel = new JLabel("<html><font size='5'color=white>Add New Reservation : </font></html>");
        roomCreateLabel.setFont(new Font("Verdana", Font.PLAIN, 5));
        headerPanel.add(roomCreateLabel);

        JPanel roomCreatePanel=new JPanel();
        roomCreatePanel.setBounds(25,50,725,550);
        roomCreatePanel.setLayout(null);
        sPanel.add(roomCreatePanel);
        roomCreatePanel.setBackground(Color.decode("#cfd8dc"));

        JLabel guestNameLabel=new JLabel("Guest Name : ");
        guestNameLabel.setBounds(10,10,100,25);
        roomCreatePanel.add(guestNameLabel);

        JTextField guestNameInput=new JTextField();
        guestNameInput.setBounds(110,10,100,25);
        roomCreatePanel.add(guestNameInput);


        JLabel roomNoLabel=new JLabel("Room No : ");
        roomNoLabel.setBounds(250,10,100,25);
        roomCreatePanel.add(roomNoLabel);

        String roomNos[]={"101","201","301","401"};
        JComboBox roomNoCombo=new JComboBox(roomNos);
        roomNoCombo.setBounds(310,10,100,25);
        roomCreatePanel.add(roomNoCombo);

        JLabel roomCategoryLabel=new JLabel("Room Category : ");
        roomCategoryLabel.setBounds(450,10,100,25);
        roomCreatePanel.add(roomCategoryLabel);

        String roomCategories[]={"Basic","Deluxe","Super Deluxe","Ultra Super Deluxe"};
        JComboBox roomCategoryCombo=new JComboBox(roomCategories);
        roomCategoryCombo.setBounds(570,10,140,25);
        roomCreatePanel.add(roomCategoryCombo);

        JLabel guestAddressLabel=new JLabel("Guest Address : ");
        guestAddressLabel.setBounds(10,55,150,25);
        roomCreatePanel.add(guestAddressLabel);

        JTextField guestAddressInput=new JTextField();
        guestAddressInput.setBounds(170,55,150,25);
        roomCreatePanel.add(guestAddressInput);

        JLabel guestPhoneNoLabel=new JLabel("Phone No:");
        guestPhoneNoLabel.setBounds(10,95,150,25);
        roomCreatePanel.add(guestPhoneNoLabel);

        JTextField guestPhIp=new JTextField();
        guestPhIp.setBounds(170,95,150,25);
        roomCreatePanel.add(guestPhIp);

        JLabel roomTypeLabel=new JLabel("Room Type : ");
        roomTypeLabel.setBounds(10,135,150,25);
        roomCreatePanel.add(roomTypeLabel);

        String roomTypes[]={"Single","Couple","Group"};
        JComboBox roomTypeCombo=new JComboBox(roomTypes);
        roomTypeCombo.setBounds(170,135,150,25);
        roomCreatePanel.add(roomTypeCombo);

        JButton saveBtn=new JButton("Save Reservation");
        saveBtn.setBounds(330,300,150,25);
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(roomCreatePanel,"Saving ..... ");
            }
        });
        roomCreatePanel.add(saveBtn);

    }
}
