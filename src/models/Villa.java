package models;

public class Villa extends Facility {

    private String roomStandard;
    private double lakeArea;
    private int floor;
    private int count;

    public Villa() {
    }

    public Villa(String roomStandard, double lakeArea) {
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
    }

    public Villa(String roomStandard, double lakeArea, int floor, int count) {
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.floor = floor;
        this.count = count;
    }

    public Villa(String id, String nameService, double area, double price, int max, String rentType, String roomStandard, double lakeArea, int floor, int count) {
        super(id, nameService, area, price, max, rentType);
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.floor = floor;
        this.count = count;
    }

    public Villa(String nameService, double area, double price, int max, String rentType, String roomStandard, double lakeArea, int floor, int count) {
        super(nameService, area, price, max, rentType);
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.floor = floor;
        this.count = count;
    }

    public Villa(String roomStandard, double lakeArea, int floor) {
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.floor = floor;
    }


    public Villa(String id, String nameService, double area, double price, int max, String rentType, String roomStandard, double lakeArea, int floor) {
        super(id, nameService, area, price, max, rentType);
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.floor = floor;
    }

    public Villa(String nameService, double area, double price, int max, String rentType, String roomStandard, double lakeArea, int floor) {
        super(nameService, area, price, max, rentType);
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.floor = floor;
    }

    public Villa(String id, String nameService, double area, double price, int max, String rentType, String roomStandard, double lakeArea) {
        super(id, nameService, area, price, max, rentType);
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
    }

    public Villa(String nameService, double area, double price, int max, String rentType, String roomStandard, double lakeArea) {
        super(nameService, area, price, max, rentType);
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getLakeArea() {
        return lakeArea;
    }

    public void setLakeArea(double lakeArea) {
        this.lakeArea = lakeArea;
    }

    public String convertLine(){
        String COMA = ",";
        return super.getId() +
                COMA + super.getNameService() +
                COMA + super.getArea() +
                COMA + super.getPrice() +
                COMA + super.getMax() +
                COMA + super.getRentType() +
                COMA + this.getRoomStandard() +
                COMA + this.getLakeArea() +
                COMA + this.getFloor() +
                COMA + this.getCount();
//        public Villa(String id, String nameService, double area, double price, int max, String rentType, String roomStandard, double lakeArea)
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", lakeArea=" + lakeArea +
                '}';
    }
}
