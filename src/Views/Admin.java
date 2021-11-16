package Views;
import Views.FrontDesk.PendingBills;
import Views.Guests.CreateGuest;
import Views.Guests.GuestLists;
import Views.Reservations.CreateReservation;
import Views.Reservations.ListReservations;
import Views.roommanagement.RoomCreate;
import Views.roommanagement.RoomsAvailableList;
import Views.roommanagement.RoomsOccupiedList;
import Views.style.GradientStyle;
import models.UsersModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.swing.BorderFactory.createLineBorder;

public class Admin {
    private JFrame adminFrame;
    private UsersModel usersModel;
    public Admin(UsersModel usersModel) throws IOException {
        this.usersModel=usersModel;
        adminFrame=new JFrame("Sajilo Hotel |  "+this.usersModel.getUsername());
        adminFrame.setVisible(true);
        adminFrame.setSize(1200,800);
        adminFrame.setDefaultCloseOperation(3);

        GradientStyle sPanel= new GradientStyle();

        adminFrame.getContentPane().add(sPanel);
        sPanel.setBounds(0,0,1200,800);

        JPanel headerPanel=new JPanel();
        headerPanel.setBounds(0,-50,1200,200);
        headerPanel.setOpaque(false);
        headerPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        sPanel.add(headerPanel);

        BufferedImage image = ImageIO.read(new File("./images/icons/hotel.png"));
        JLabel logoImage = new JLabel(new ImageIcon(image));


        JLabel totalRooms=new JLabel("<html><font size='5'color=white> Total Rooms :: </font></html>");
        JLabel totalRoomsCount=new JLabel("<html><font size='5'color=white>0</font></html>");

        JLabel availableRooms=new JLabel("<html><font size='5'color=white> Available Rooms :: </font></html>");
        JLabel availableRoomsCount=new JLabel("<html><font size='5'color=white>0</font></html>");

        JLabel occupiedRooms=new JLabel("<html><font size='5'color=white> Occupied Rooms :: </font></html>");
        JLabel occupiedRoomsCount=new JLabel("<html><font size='5'color=white>0</font></html>");

        String loggedInUser="<html><font size='5'color=white>"+this.usersModel.getUsername()+"</font></html>";
        JLabel loggedIn=new JLabel(loggedInUser);

        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        String todaysDates="<html><font size='5' color=white>"+date+"</font></html>";
        JLabel todaysDate=new JLabel(todaysDates);

        JButton logoutBtn=new JButton("LogOut");
        logoutBtn.setOpaque(false);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setBorderPainted(true);
        logoutBtn.setForeground(Color.white);

        headerPanel.add(logoImage);
        headerPanel.add(totalRooms);
        headerPanel.add(totalRoomsCount);
        headerPanel.add(availableRooms);
        headerPanel.add(availableRoomsCount);
        headerPanel.add(occupiedRooms);
        headerPanel.add(occupiedRoomsCount);
        headerPanel.add(todaysDate);
        headerPanel.add(loggedIn);
        headerPanel.add(logoutBtn);
        ((FlowLayout)headerPanel.getLayout()).setHgap(20);

        Border blackline = createLineBorder(Color.black);

        JPanel reservationPanel=new JPanel();
        reservationPanel.setBounds(15,100,300,200);
        reservationPanel.setOpaque(false);
        reservationPanel.setLayout(new BoxLayout (reservationPanel, BoxLayout.Y_AXIS));
        reservationPanel.setBorder(blackline);
        sPanel.add(reservationPanel);

        reservationPanel.add(Box.createRigidArea(new Dimension(5, 15)));


        JLabel reservationLabel=new JLabel("<html><font size='5'color=white>Reservation Section</font></html>");
        reservationLabel.setFont(new Font("Verdana", Font.PLAIN,5));
        reservationPanel.add(reservationLabel);
        reservationPanel.add(Box.createRigidArea(new Dimension(5, 15)));


        Icon reservationIcon=new ImageIcon(new ImageIcon("./images/icons/newreservation.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton createNewReservationBtn=new JButton("Create New Reservation",reservationIcon);
        createNewReservationBtn.setOpaque(false);
        createNewReservationBtn.setContentAreaFilled(false);
        createNewReservationBtn.setBorderPainted(true);
        createNewReservationBtn.setForeground(Color.white);
        createNewReservationBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateReservation createReservation=new CreateReservation();
            }
        });
        reservationPanel.add(createNewReservationBtn);

        reservationPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        Icon listIcon=new ImageIcon(new ImageIcon("./images/icons/list.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton seeReservationListBtn=new JButton("List of Reservations",listIcon);
        seeReservationListBtn.setOpaque(false);
        seeReservationListBtn.setContentAreaFilled(false);
        seeReservationListBtn.setBorderPainted(true);
        seeReservationListBtn.setForeground(Color.white);
        seeReservationListBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListReservations listReservations=new ListReservations();
            }
        });
        reservationPanel.add(seeReservationListBtn);


        JPanel frontDeskPanel=new JPanel();
        frontDeskPanel.setBounds(450,100,300,200);
        frontDeskPanel.setOpaque(false);
        frontDeskPanel.setLayout(new BoxLayout (frontDeskPanel, BoxLayout.Y_AXIS));
        frontDeskPanel.setBorder(blackline);
        sPanel.add(frontDeskPanel);

        frontDeskPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        JLabel frontDeskLabel=new JLabel("<html><font size='5'color=white>Front Desk Section</font></html>");
        frontDeskLabel.setFont(new Font("Verdana", Font.PLAIN,5));
        frontDeskPanel.add(frontDeskLabel);
        frontDeskPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        Icon checkOutIcon=new ImageIcon(new ImageIcon("./images/icons/checkout.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton checkOutListBtn=new JButton("Checkout Lists",checkOutIcon);
        checkOutListBtn.setOpaque(false);
        checkOutListBtn.setContentAreaFilled(false);
        checkOutListBtn.setBorderPainted(true);
        checkOutListBtn.setForeground(Color.white);
        frontDeskPanel.add(checkOutListBtn);

        frontDeskPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        Icon pendingBillsIcon=new ImageIcon(new ImageIcon("./images/icons/pendingbills.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton pendingBillsBtn=new JButton("Pending Bills",pendingBillsIcon);
        pendingBillsBtn.setOpaque(false);
        pendingBillsBtn.setContentAreaFilled(false);
        pendingBillsBtn.setBorderPainted(true);
        pendingBillsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PendingBills pendingBills=new PendingBills();
            }
        });
        pendingBillsBtn.setForeground(Color.white);

        frontDeskPanel.add(pendingBillsBtn);


        JPanel guestPanel=new JPanel();
        guestPanel.setBounds(850,100,300,200);
        guestPanel.setOpaque(false);
        guestPanel.setLayout(new BoxLayout (guestPanel, BoxLayout.Y_AXIS));
        guestPanel.setBorder(blackline);
        sPanel.add(guestPanel);


        guestPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        JLabel guestLabel=new JLabel("<html><font size='5'color=white>Guests Section</font></html>");
        guestLabel.setFont(new Font("Verdana", Font.PLAIN,5));
        guestPanel.add(guestLabel);
        guestPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        Icon newGuestIcon=new ImageIcon(new ImageIcon("./images/icons/newguest.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton newGuestBtn=new JButton("Create a New Guest",newGuestIcon);
        newGuestBtn.setOpaque(false);
        newGuestBtn.setContentAreaFilled(false);
        newGuestBtn.setBorderPainted(true);
        newGuestBtn.setForeground(Color.white);
        newGuestBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateGuest createGuest=new CreateGuest();
            }
        });
        guestPanel.add(newGuestBtn);

        guestPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        Icon guestListIcon=new ImageIcon(new ImageIcon("./images/icons/guest-list.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton checkGuestListBtn=new JButton("Check Guest Lists",guestListIcon);
        checkGuestListBtn.setOpaque(false);
        checkGuestListBtn.setContentAreaFilled(false);
        checkGuestListBtn.setBorderPainted(true);
        checkGuestListBtn.setForeground(Color.white);
        checkGuestListBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuestLists guestLists=new GuestLists();
            }
        });
        guestPanel.add(checkGuestListBtn);


        JPanel roomManagementPanel=new JPanel();
        roomManagementPanel.setBounds(450,320,300,280);
        roomManagementPanel.setOpaque(false);
        roomManagementPanel.setLayout(new BoxLayout (roomManagementPanel, BoxLayout.Y_AXIS));
        roomManagementPanel.setBorder(blackline);
        sPanel.add(roomManagementPanel);

        roomManagementPanel.add(Box.createRigidArea(new Dimension(5, 15)));


        JLabel roomManagementLabel=new JLabel("<html><font size='5'color=white>Room Management Section</font></html>");
        roomManagementLabel.setFont(new Font("Verdana", Font.PLAIN,5));
        roomManagementPanel.add(roomManagementLabel);

        roomManagementPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        Icon newroomIcon=new ImageIcon(new ImageIcon("./images/icons/newroom.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton addNewRoomBtn=new JButton("Create a New Room",newroomIcon);
        addNewRoomBtn.setOpaque(false);
        addNewRoomBtn.setContentAreaFilled(false);
        addNewRoomBtn.setBorderPainted(true);
        addNewRoomBtn.setForeground(Color.white);
        roomManagementPanel.add(addNewRoomBtn);
        addNewRoomBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    RoomCreate rc1=new RoomCreate(usersModel);
//                    RoomDetails r1 = new RoomDetails();
                }catch (Exception exception){
                    System.out.println(exception.getMessage());
                }
            }
        });
        roomManagementPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        Icon availableroomIcon=new ImageIcon(new ImageIcon("./images/icons/rooms.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton checkAvailableRoomsBtn=new JButton("Check Available Rooms ",availableroomIcon);
        checkAvailableRoomsBtn.setOpaque(false);
        checkAvailableRoomsBtn.setContentAreaFilled(false);
        checkAvailableRoomsBtn.setBorderPainted(true);
        checkAvailableRoomsBtn.setForeground(Color.white);
        checkAvailableRoomsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RoomsAvailableList roomsAvailableList=new RoomsAvailableList();
            }
        });
        roomManagementPanel.add(checkAvailableRoomsBtn);

        roomManagementPanel.add(Box.createRigidArea(new Dimension(5, 15)));

        Icon occupiedroomsIcon=new ImageIcon(new ImageIcon("./images/icons/occupiedrooms.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton checkOccupiedRoomsListBtn=new JButton("Check Occupied Rooms List",occupiedroomsIcon);
        checkOccupiedRoomsListBtn.setOpaque(false);
        checkOccupiedRoomsListBtn.setContentAreaFilled(false);
        checkOccupiedRoomsListBtn.setBorderPainted(true);
        checkOccupiedRoomsListBtn.setForeground(Color.white);
        checkOccupiedRoomsListBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RoomsOccupiedList roomsOccupiedList=new RoomsOccupiedList();
            }
        });
        roomManagementPanel.add(checkOccupiedRoomsListBtn);

    }
}
