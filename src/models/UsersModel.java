package models;

public class UsersModel {
    private int id;
    private String username;
    private String password;
    private int position;

    public UsersModel(String username, String password, int position) {
        this.username = username;
        this.password = password;
        this.position = position;
    }

    public UsersModel(int id, String username, int position) {
        this.id = id;
        this.username = username;
        this.position = position;
    }

    public UsersModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UsersModel(int id, String username, String password, int position) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "UsersModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", position=" + position +
                '}';
    }
}
