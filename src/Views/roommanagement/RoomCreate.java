package Views.roommanagement;

import Views.style.GradientStyle;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomCreate {
    public RoomCreate() {
        JFrame roomCreateFrame = new JFrame("Sajilo Hotel | Room Create ");
        roomCreateFrame.setVisible(true);
        roomCreateFrame.setSize(800, 600);
        roomCreateFrame.setDefaultCloseOperation(1);

        GradientStyle sPanel = new GradientStyle();

        roomCreateFrame.getContentPane().add(sPanel);
        sPanel.setBounds(0, 0, 800, 600);



        JPanel headerPanel = new JPanel();
        headerPanel.setBounds(0, 0, 800, 100);
        headerPanel.setOpaque(false);
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        sPanel.add(headerPanel);

        JLabel roomCreateLabel = new JLabel("<html><font size='5'color=white>Add New Room : </font></html>");
        roomCreateLabel.setFont(new Font("Verdana", Font.PLAIN, 5));
        headerPanel.add(roomCreateLabel);

        SpringLayout layout = new SpringLayout();

        JPanel roomCreatePanel=new JPanel();
        roomCreatePanel.setBounds(25,50,725,550);
        roomCreatePanel.setLayout(null);
        sPanel.add(roomCreatePanel);
        roomCreatePanel.setBackground(Color.decode("#cfd8dc"));

        JLabel roomNoLabel=new JLabel("Room NO : ");
        roomNoLabel.setBounds(10,10,100,25);
        roomCreatePanel.add(roomNoLabel);

        JTextField roomNoInput=new JTextField();
        roomNoInput.setBounds(110,10,100,25);
        roomCreatePanel.add(roomNoInput);


        JLabel roomFloor=new JLabel("Floor : ");
        roomFloor.setBounds(250,10,100,25);
        roomCreatePanel.add(roomFloor);

        String floors[]={"Ground Floor","First Floor","Second Floor","Third Floor","Fourth Floor","Fifth Floor"};
        JComboBox floorCombo=new JComboBox(floors);
        floorCombo.setBounds(310,10,100,25);
        roomCreatePanel.add(floorCombo);

        JLabel roomCategoryLabel=new JLabel("Room Category : ");
        roomCategoryLabel.setBounds(450,10,100,25);
        roomCreatePanel.add(roomCategoryLabel);

        String roomCategories[]={"Basic","Deluxe","Super Deluxe","Ultra Super Deluxe"};
        JComboBox roomCategoryCombo=new JComboBox(roomCategories);
        roomCategoryCombo.setBounds(570,10,140,25);
        roomCreatePanel.add(roomCategoryCombo);

        JLabel roomSpecialAttributeLabel=new JLabel("Room Special Attribute : ");
        roomSpecialAttributeLabel.setBounds(10,55,150,25);
        roomCreatePanel.add(roomSpecialAttributeLabel);

        JTextField roomSpecialAttributeInput=new JTextField();
        roomSpecialAttributeInput.setBounds(170,55,150,25);
        roomCreatePanel.add(roomSpecialAttributeInput);

        JLabel chargePerDay=new JLabel("Charge Per Day");
        chargePerDay.setBounds(10,95,150,25);
        roomCreatePanel.add(chargePerDay);

        JTextField chargePerDayInput=new JTextField();
        chargePerDayInput.setBounds(170,95,150,25);
        roomCreatePanel.add(chargePerDayInput);

        JLabel roomTypeLabel=new JLabel("Room Type : ");
        roomTypeLabel.setBounds(10,135,150,25);
        roomCreatePanel.add(roomTypeLabel);

        String roomTypes[]={"Single","Couple","Group"};
        JComboBox roomTypeCombo=new JComboBox(roomTypes);
        roomTypeCombo.setBounds(170,135,150,25);
        roomCreatePanel.add(roomTypeCombo);

        JLabel usernameLabel=new JLabel("Username");
        usernameLabel.setBounds(10,175,150,25);
        roomCreatePanel.add(usernameLabel);

        JTextField usernameInput=new JTextField();
        usernameInput.setEditable(false);
        usernameInput.setBounds(170,175,150,25);
        roomCreatePanel.add(usernameInput);

        JButton generateUsernameBtn=new JButton("Generate Username");
        generateUsernameBtn.setBounds(350,175,150,25);
        generateUsernameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameInput.setText("sh101");
            }
        });
        roomCreatePanel.add(generateUsernameBtn);

        JLabel passwordLabel=new JLabel("Password");
        passwordLabel.setBounds(10,215,150,25);
        roomCreatePanel.add(passwordLabel);

        JTextField passwordInput=new JTextField();
        passwordInput.setEditable(false);
        passwordInput.setBounds(170,215,150,25);
        roomCreatePanel.add(passwordInput);

        JButton generatePasswordBtn=new JButton("Generate Password");
        generatePasswordBtn.setBounds(350,215,150,25);
        generatePasswordBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordInput.setText("sh101");
            }
        });
        roomCreatePanel.add(generatePasswordBtn);

        JButton roomImageChooser=new JButton("Choose Room Image");
        roomImageChooser.setBounds(300,255,170,25);
        FileFilter imageFilter = new FileNameExtensionFilter(
                "Image files", ImageIO.getReaderFileSuffixes());
        roomImageChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser f1=new JFileChooser();
                f1.addChoosableFileFilter(imageFilter);
                int r=f1.showSaveDialog(roomCreatePanel);
            }
        });
        roomCreatePanel.add(roomImageChooser);

        JButton saveBtn=new JButton("Save Room");
        saveBtn.setBounds(330,300,100,25);
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(roomCreatePanel,"Saving ..... ");
            }
        });
        roomCreatePanel.add(saveBtn);

    }
}
