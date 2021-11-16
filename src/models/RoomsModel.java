package models;

public class RoomsModel {
    private int id;
    private int room_no;
    private String floor;
    private String category;
    private String special;
    private int rate;
    private int is_reserved;
    private int is_occupied;
    private int user_id;

    public RoomsModel(int id, int room_no, String floor, String category, String special, int rate, int is_reserved, int is_occupied, int user_id) {
        this.id = id;
        this.room_no = room_no;
        this.floor = floor;
        this.category = category;
        this.special = special;
        this.rate = rate;
        this.is_reserved = is_reserved;
        this.is_occupied = is_occupied;
        this.user_id = user_id;
    }

    public RoomsModel(int room_no, String floor, String category, String special, int rate, int is_reserved, int is_occupied, int user_id) {
        this.room_no = room_no;
        this.floor = floor;
        this.category = category;
        this.special = special;
        this.rate = rate;
        this.is_reserved = is_reserved;
        this.is_occupied = is_occupied;
        this.user_id = user_id;
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

    public int getIs_reserved() {
        return is_reserved;
    }

    public int getIs_occupied() {
        return is_occupied;
    }

    public int getUser_id() {
        return user_id;
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
                ", is_reserved=" + is_reserved +
                ", is_occupied=" + is_occupied +
                ", user_id=" + user_id +
                '}';
    }
}
