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

    @Override
    public String convertLine() {
        String COMMA = ",";
        return super.getId() +
                COMMA + super.getNameService() +
                COMMA + super.getArea() +
                COMMA + super.getPrice() +
                COMMA + super.getMax() +
                COMMA + super.getRentType() +
                COMMA + this.getFreeService();
    }
//    public Room(String id, String nameService, double area, double price, int max, String rentType, String freeService) {
//        super(id, nameService, area, price, max, rentType);
//        this.freeService = freeService;
//    }

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
