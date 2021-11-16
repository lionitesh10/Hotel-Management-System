package Controllers;

import Views.Accounts.Login;
import DbHelper.DatabaseInitialization;

import java.io.IOException;

public class Main {
    Main() throws IOException {
        Login login=new Login();
    }
    public static void main(String[] args) throws IOException {
        DatabaseInitialization db1=new DatabaseInitialization();
        db1.create_database();
        db1.createTable();
        Main main=new Main();
    }
}
