package models;

import java.util.Date;

public class Booking {

    private int bookingNumber;
    private String startDate;
    private String finishDate;
    private long idCustomer;
    private Customer serviceName;
    private Facility typeService;


    public Booking(int bookingNumber, String startDate, String finishDate, long idCustomer, Customer serviceName, Facility typeService) {
        this.bookingNumber = bookingNumber;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
        this.typeService = typeService;
    }

    public Customer getServiceName() {
        return serviceName;
    }

    public Facility getTypeService() {
        return typeService;
    }

    public Booking(int bookingNumber, String startDate, String finishDate, long idCustomer, String serviceName, String typeService) {
        this.bookingNumber = bookingNumber;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.idCustomer = idCustomer;

    }

    public Booking() {
    }

    public Booking(int id, String startDate, String endDate, Customer customer, Facility facility) {
    }

    public void setServiceName(Customer serviceName) {
        this.serviceName = serviceName;
    }

    public void setTypeService(Facility typeService) {
        this.typeService = typeService;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingNumber=" + bookingNumber +
                ", startDate='" + startDate + '\'' +
                ", finishDate='" + finishDate + '\'' +
                ", idCustomer=" + idCustomer +
                ", serviceName=" + serviceName +
                ", typeService=" + typeService +
                '}';
    }
}
