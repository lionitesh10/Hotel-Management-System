package DbHelper;

import java.sql.*;

public class DatabaseInitialization {
    private String driver="com.mysql.jdbc.Driver";
    private String db_firsttime_url="jdbc:mysql://localhost:3306/";
    private String db_url="jdbc:mysql://localhost:3306/SajiloHotel";
    private String db_userName="root";
    private String db_password="";
    Statement stmt,statement;
    Connection conn;

    public void create_database(){
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(db_firsttime_url,db_userName,db_password);
            stmt=conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE if not exists SajiloHotel");
            conn.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void createConnection(){
        try{
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(db_url,db_userName,db_password);
            stmt=conn.createStatement();
            statement=conn.createStatement();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void createTable(){
        createConnection();
        try{
            stmt.executeUpdate("CREATE TABLE if not exists Users(" +
                    "Id int NOT NULL AUTO_INCREMENT," +
                    "Username varchar(255) not null," +
                    "Password varchar(255) not null," +
                    "Position int not null," +
                    "PRIMARY KEY(Id)" +
                    ");" +
                    "");
            stmt.executeUpdate("CREATE TABLE if not exists Rooms(" +
                    "Id int Not NULL AUTO_INCREMENT PRIMARY KEY," +
                    "Roomno int not null," +
                    "floor varchar(255) not null," +
                    "category varchar(255) not null," +
                    "special varchar(500) not null," +
                    "rate int not null," +
                    "is_reserved tinyint(0) not null," +
                    "is_occupied tinyint(0) not null," +
                    "user_id int," +
                    "FOREIGN KEY(user_id) REFERENCES Users(Id)" +
                    ");");

            stmt.executeUpdate("CREATE TABLE if not exists Reservations(" +
                    "Id int Not NULL AUTO_INCREMENT PRIMARY KEY," +
                    "guestname varchar(255) not null," +
                    "phone_no varchar(255) not null," +
                    "address varchar(255) not null," +
                    "date varchar(255) not null," +
                    "status tinyint(1) not null," +
                    "room_id int," +
                    "FOREIGN KEY(room_id) REFERENCES Rooms(Id)" +
                    ");");

            stmt.executeUpdate("CREATE TABLE if not exists Guests(" +
                    "Id int Not Null AUTO_INCREMENT PRIMARY KEY," +
                    "guestname varchar(255) not null," +
                    "address varchar(255) not null," +
                    "identity varchar(255) not null," +
                    "phone_no varchar(255) not null," +
                    "is_active tinyint(1) not null," +
                    "date varchar(255) not null," +
                    "room_id int," +
                    "FOREIGN KEY(room_id) REFERENCES Rooms(Id)" +
                    ");");

            stmt.executeUpdate("CREATE TABLE if not exists Bills(" +
                    "Id int NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "Item varchar(255) not null," +
                    "rate varchar(255) not null," +
                    "quantity varchar(255) not null," +
                    "staydays varchar(255) not null," +
                    "guest_id int," +
                    "FOREIGN KEY(guest_id) REFERENCES Guests(Id)" +
                    ");");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
