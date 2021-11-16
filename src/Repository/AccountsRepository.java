package Repository;

import models.UsersModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountsRepository {
    private String driver="com.mysql.jdbc.Driver";
    private String db_url="jdbc:mysql://localhost:3306/SajiloHotel";
    private String db_userName="root";
    private String db_password="";
    Statement stmt,statement;
    Connection conn;

    public void createConnection(){
        try{
            Class.forName(driver);
            Connection conn= DriverManager.getConnection(db_url,db_userName,db_password);
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
                usersModel1=new UsersModel(user.getInt("Id"),user.getString("Username"),user.getString("Password"),user.getInt("Position"));
                return usersModel1;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
