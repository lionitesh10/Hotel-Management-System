package Views.roommanagement;

import Controllers.RoomsController;
import Repository.RoomsRepository;
import Views.style.GradientStyle;
import models.RoomsModel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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

        JLabel roomColumns=new JLabel("\t       S.N       \t   Room No.   \t       Floor   \t      Category   \t      Type   ");
        roomDetailPanel.add(roomColumns);

        RoomsController roomsController=new RoomsController();
        ArrayList<RoomsModel> roomsModelArrayList=roomsController.showRooms();

        ArrayList<JLabel> jLabelArrayList=new ArrayList<>();

        for(int i=0;i<roomsModelArrayList.size();i++){
            RoomsModel roomsModel=roomsModelArrayList.get(i);
            jLabelArrayList.add(new JLabel("\t    .   \t"+(i+1)+"\t    \t    \t"+roomsModel.getRoom_no()+"\t         \t"+roomsModel.getFloor()+"\t          \t"+roomsModel.getCategory()+"\t     \t"+roomsModel.getRoom_type()));
        }
        for(int j=0;j<jLabelArrayList.size();j++){
            roomDetailPanel.add(new JLabel("\n"));
            roomDetailPanel.add(jLabelArrayList.get(j));
        }


    }
}
