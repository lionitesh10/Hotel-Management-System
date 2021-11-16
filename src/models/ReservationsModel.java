package models;

public class ReservationsModel {
    /*Id int Not NULL AUTO_INCREMENT PRIMARY KEY," +
                    "guestname varchar(255) not null," +
                    "phone_no varchar(255) not null," +
                    "address varchar(255) not null," +
                    "date varchar(255) not null," +
                    "status tinyint(1) not null," +
                    "room_id int

     */
    private int id;
    private String guestName;
    private String phone_no;
    private String address;
    private String date;
    private int status;
    private int room_id;

    public ReservationsModel(int id, String guestName, String phone_no, String address, String date, int status, int room_id) {
        this.id = id;
        this.guestName = guestName;
        this.phone_no = phone_no;
        this.address = address;
        this.date = date;
        this.status = status;
        this.room_id = room_id;
    }

    public ReservationsModel(String guestName, String phone_no, String address, String date, int status, int room_id) {
        this.guestName = guestName;
        this.phone_no = phone_no;
        this.address = address;
        this.date = date;
        this.status = status;
        this.room_id = room_id;
    }

    public int getId() {
        return id;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    public int getStatus() {
        return status;
    }

    public int getRoom_id() {
        return room_id;
    }

    @Override
    public String toString() {
        return "ReservationsModel{" +
                "id=" + id +
                ", guestName='" + guestName + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                ", status=" + status +
                ", room_id=" + room_id +
                '}';
    }
}
