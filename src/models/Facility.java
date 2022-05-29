package models;

import java.util.Objects;

public abstract class Facility {
    private String id;
    private String nameService;
    private double area;
    private double price;
    private int max;
    private String rentType;

    public Facility() {
    }

    public Facility(String id, String nameService, double area, double price, int max, String rentType) {
        this.id = id;
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.max = max;
        this.rentType = rentType;
    }

    public Facility(String nameService, double area, double price, int max, String rentType) {
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.max = max;
        this.rentType = rentType;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMax() {
        return max;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", max=" + max +
                ", rentType='" + rentType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Double.compare(facility.area, area) == 0 && Double.compare(facility.price, price) == 0 && max == facility.max && Objects.equals(nameService, facility.nameService) && Objects.equals(rentType, facility.rentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameService, area, price, max, rentType);
    }
}
