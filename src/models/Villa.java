package models;

public class Villa extends Facility {

    private String roomStandard;
    private double lakeArea;

    public Villa() {
    }


    public Villa(String roomStandard, double lakeArea) {
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
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

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", lakeArea=" + lakeArea +
                '}';
    }
}
