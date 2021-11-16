package models;

public class GuestsModel {
    /*
                    "Id int Not Null AUTO_INCREMENT PRIMARY KEY," +
                    "guestname varchar(255) not null," +
                    "address varchar(255) not null," +
                    "identity varchar(255) not null," +
                    "phone_no varchar(255) not null," +
                    "is_active tinyint(1) not null," +
                    "date varchar(255) not null," +
                    "room_id int," +
                    "FOREIGN KEY(room_id) REFERENCES Rooms(Id)
     */
    private int id;
    private String guestName;
    private String address;
    private String identity;
    private String phone_no;
    private int is_active;
    private String date;
    private int room_id;

    public GuestsModel(int id, String guestName, String address, String identity, String phone_no, int is_active, String date, int room_id) {
        this.id = id;
        this.guestName = guestName;
        this.address = address;
        this.identity = identity;
        this.phone_no = phone_no;
        this.is_active = is_active;
        this.date = date;
        this.room_id = room_id;
    }

    public GuestsModel(String guestName, String address, String identity, String phone_no, int is_active, String date, int room_id) {
        this.guestName = guestName;
        this.address = address;
        this.identity = identity;
        this.phone_no = phone_no;
        this.is_active = is_active;
        this.date = date;
        this.room_id = room_id;
    }

    public int getId() {
        return id;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getAddress() {
        return address;
    }

    public String getIdentity() {
        return identity;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public int getIs_active() {
        return is_active;
    }

    public String getDate() {
        return date;
    }

    public int getRoom_id() {
        return room_id;
    }

    @Override
    public String toString() {
        return "GuestsModel{" +
                "id=" + id +
                ", guestName='" + guestName + '\'' +
                ", address='" + address + '\'' +
                ", identity='" + identity + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", is_active=" + is_active +
                ", date='" + date + '\'' +
                ", room_id=" + room_id +
                '}';
    }
}
