package models;

public class BillsModel {
    /*
    Id int NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "Item varchar(255) not null," +
                    "rate varchar(255) not null," +
                    "quantity varchar(255) not null," +
                    "staydays varchar(255) not null,
                    status" +
                    "guest_id int," +
                    "FOREIGN KEY(guest_id) REFERENCES Guests(Id)"
     */
    private int id;
    private String item;
    private int rate;
    private String quantity;
    private int staydays;
    private int status;
    private int guest_id;

    public BillsModel(String item, int rate, String quantity, int staydays, int status, int guest_id) {
        this.item = item;
        this.rate = rate;
        this.quantity = quantity;
        this.staydays = staydays;
        this.status = status;
        this.guest_id = guest_id;
    }

    public BillsModel(int id, String item, int rate, String quantity, int staydays, int status, int guest_id) {
        this.id = id;
        this.item = item;
        this.rate = rate;
        this.quantity = quantity;
        this.staydays = staydays;
        this.status = status;
        this.guest_id = guest_id;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public int getRate() {
        return rate;
    }

    public String getQuantity() {
        return quantity;
    }

    public int getStaydays() {
        return staydays;
    }

    public int getStatus() {
        return status;
    }

    public int getGuest_id() {
        return guest_id;
    }

    @Override
    public String toString() {
        return "BillsModel{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", rate=" + rate +
                ", quantity='" + quantity + '\'' +
                ", staydays=" + staydays +
                ", status=" + status +
                ", guest_id=" + guest_id +
                '}';
    }
}
