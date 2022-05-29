package models;

public class Room extends Facility {

    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameService, double area, double price, int max, String rentType, String freeService) {
        super(id, nameService, area, price, max, rentType);
        this.freeService = freeService;
    }

    public Room(String nameService, double area, double price, int max, String rentType, String freeService) {
        super(nameService, area, price, max, rentType);
        this.freeService = freeService;
    }

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
