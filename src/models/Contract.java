package models;

public class Contract {

    private long contractNumber;
    private long bookingNumber;
    private double deposit;
    private double totalPrice;
    private long idCustomer;

    public Contract() {
    }

    public Contract(long contractNumber, long bookingNumber, double deposit, double totalPrice, long idCustomer) {
        this.contractNumber = contractNumber;
        this.bookingNumber = bookingNumber;
        this.deposit = deposit;
        this.totalPrice = totalPrice;
        this.idCustomer = idCustomer;
    }

    public long getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(long contractNumber) {
        this.contractNumber = contractNumber;
    }

    public long getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(long bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", bookingNumber=" + bookingNumber +
                ", deposit=" + deposit +
                ", totalPrice=" + totalPrice +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
