package Repository;

import models.RoomsModel;

import java.sql.*;
import java.util.ArrayList;

public class RoomsRepository {
    String driver="com.mysql.jdbc.Driver";
    String db_url="jdbc:mysql://localhost:3306/SajiloHotel";
    String db_userName="root";
    String db_password="";
    Statement stmt,statement;
    Connection conn;
    public void createConnection(){
        try{
            Class.forName(driver);
            conn= DriverManager.getConnection(db_url,db_userName,db_password);
            stmt=conn.createStatement();
            statement=conn.createStatement();
        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public int insertRoomData(RoomsModel room){
        createConnection();
        try{
            System.out.println(room);
            String insertSql="INSERT INTO `rooms`(`Roomno`, `floor`, `category`, `special`, `rate`, `room_type`, `is_reserved`, `is_occupied`, `user_id`) " +
                    "VALUES ('"+
                    room.getRoom_no()+
                    "','"+
                    room.getFloor()+
                    "','"+
                    room.getCategory()+"','"+
                    room.getSpecial()+"','"+
                    room.getRate()+"','"+
                    room.getRoom_type()+"',"
                    +0+"," +
                    ""+0+","+room.getUsersModel().getId()+")";
            stmt.executeUpdate(insertSql);
            conn.close();
            return 1;
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return 0;
    }


    public ArrayList<RoomsModel> getAvailableRooms(){
        ArrayList<RoomsModel> roomsModelArrayList=new ArrayList<>();
        createConnection();
        try{
            String getAvaliableRoomsSql="Select * from `rooms` where is_reserved=0 AND is_occupied=0;";
            ResultSet resultSet= stmt.executeQuery(getAvaliableRoomsSql);
            AccountsRepository accountsRepository=new AccountsRepository();
            while(resultSet.next()){
                roomsModelArrayList.add(new RoomsModel(resultSet.getInt("Id"),resultSet.getInt("Roomno"),resultSet.getString("floor"),resultSet.getString("category"),resultSet.getString("special"),resultSet.getInt("rate"),resultSet.getString("room_type"),resultSet.getInt("is_reserved"),resultSet.getInt("is_occupied"),accountsRepository.getUserByID(resultSet.getInt("user_id"))));
            }
//            System.out.println(roomsModelArrayList.toString());
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return roomsModelArrayList;
    }
}

