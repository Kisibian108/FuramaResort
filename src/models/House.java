package models;

public class House extends Facility {

    private String roomStandard;
    private int floor;

    public House() {
    }



    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(String id, String nameService, double area, double price, int max, String rentType, String roomStandard, int floor) {
        super(id, nameService, area, price, max, rentType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(String nameService, double area, double price, int max, String rentType, String roomStandard, int floor) {
        super(nameService, area, price, max, rentType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    @Override
    public String convertLine() {
        String COMMA = ",";
        return super.getId() +
                COMMA + super.getNameService() +
                COMMA + super.getArea() +
                COMMA + super.getPrice() +
                COMMA + super.getMax() +
                COMMA + super.getRentType() +
                COMMA + this.getRoomStandard() +
                COMMA + this.getFloor();
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
