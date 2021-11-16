package Repository;

import models.UsersModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountsRepository {
    Statement stmt,statement;
    Connection conn;
    String driver="com.mysql.jdbc.Driver";
    String db_url="jdbc:mysql://localhost:3306/SajiloHotel";
    String db_userName="root";
    String db_password="";
    public void createConnection(){
        try{
            Class.forName(driver);
            conn= DriverManager.getConnection(db_url,db_userName,db_password);
            stmt=conn.createStatement();
            statement=conn.createStatement();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public UsersModel loginSql(UsersModel usersModel){
        createConnection();
        UsersModel usersModel1;
        String loginQuery="SELECT * FROM `users` WHERE Username='"+usersModel.getUsername()+"' AND Password='"+usersModel.getPassword()+"';";
        try{
            ResultSet user=stmt.executeQuery(loginQuery);
            while (user.next()) {
                System.out.println(user.getString("Username"));
                int id=user.getInt("Id");
                usersModel1=new UsersModel(id,user.getString("Username"),user.getString("Password"),user.getInt("Position"));
                conn.close();
                return usersModel1;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public UsersModel getUserByID(int id){
        createConnection();
        UsersModel usersModel;
        String getUserId="SELECT * FROM `users` WHERE Id="+id+";";
        try{
            ResultSet user=stmt.executeQuery(getUserId);
            while (user.next()) {
                usersModel=new UsersModel(user.getInt(0),user.getString("Username"),user.getInt("Position"));
                conn.close();
                return usersModel;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
