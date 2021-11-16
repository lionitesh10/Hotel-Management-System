package models;

public class RoomsModel {
    private int id;
    private int room_no;
    private String floor;
    private String category;
    private String special;
    private int rate;
    private String room_type;
    private int is_reserved;
    private int is_occupied;
    private UsersModel usersModel;

    public RoomsModel(int id, int room_no, String floor, String category, String special, int rate,String room_type, int is_reserved, int is_occupied, UsersModel usersModel) {
        this.id = id;
        this.room_no = room_no;
        this.floor = floor;
        this.category = category;
        this.special = special;
        this.rate = rate;
        this.is_reserved = is_reserved;
        this.is_occupied = is_occupied;
        this.usersModel = usersModel;
        this.room_type=room_type;
    }

    public RoomsModel(int room_no, String floor, String category, String special, int rate,String room_type, int is_reserved, int is_occupied, UsersModel usersModel) {
        this.room_no = room_no;
        this.floor = floor;
        this.category = category;
        this.special = special;
        this.rate = rate;
        this.is_reserved = is_reserved;
        this.is_occupied = is_occupied;
        this.usersModel = usersModel;
        this.room_type=room_type;
    }

    public int getId() {
        return id;
    }

    public int getRoom_no() {
        return room_no;
    }

    public String getFloor() {
        return floor;
    }

    public String getCategory() {
        return category;
    }

    public String getSpecial() {
        return special;
    }

    public int getRate() {
        return rate;
    }

    public String getRoom_type() {
        return room_type;
    }

    public int getIs_reserved() {
        return is_reserved;
    }

    public int getIs_occupied() {
        return is_occupied;
    }

    public UsersModel getUsersModel() {
        return usersModel;
    }

    @Override
    public String toString() {
        return "RoomsModel{" +
                "id=" + id +
                ", room_no=" + room_no +
                ", floor='" + floor + '\'' +
                ", category='" + category + '\'' +
                ", special='" + special + '\'' +
                ", rate=" + rate +
                ", room_type='" + room_type + '\'' +
                ", is_reserved=" + is_reserved +
                ", is_occupied=" + is_occupied +
                ", usersModel=" + usersModel +
                '}';
    }
}
