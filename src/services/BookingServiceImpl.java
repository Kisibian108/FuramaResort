package services;

import models.Booking;
import models.Customer;
import models.Facility;
import models.Villa;
import utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(1,"Linh", "10/08/1994", "Male", 184392567, 974325476,"kisibian999@gmail.com","Gold", "Ha Tinh"));
        customerList.add(new Customer(2,"Hoa", "11/04/1987","Female",182354657,976324321,"hoanglien124@gmail.com","Diamond", "Da Nang"));
        customerList.add(new Customer(3,"Ngoc","06/03/1988","Female",183245365,974325467,"kisibian249@gmail.com","Silve","Hai Phong"));

        facilityIntegerMap.put(new Villa("1","Villa", 198, 200, 3,"Dayly", "VIP", 50), 0);
        facilityIntegerMap.put(new Villa("2","Villa", 120, 300, 3,"Dayly", "VIP", 100), 1);

    }

    @Override
    public void display() {
        for (Booking booking: bookingSet) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void add() {

        int id = 1;
        if(!bookingSet.isEmpty()){
            id = bookingSet.size();
        }

    Customer customer = chooseCustomer();
    Facility facility = chooseFacility();

        System.out.println("Nhap ngay bat dau thue");
        String startDate = scanner.nextLine();
        System.out.println("Nhap ngay tra phong");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer,facility);
        bookingSet.add(booking);
        System.out.println("Da tao booking thanh cong");

    }

    @Override
    public void edit() {
    }
    public static Customer chooseCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sach khach hang");
        for (Customer customer: customerList){
            System.out.println(customer.toString());
        }
        System.out.println("Nhap id khach hang");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check){
            for (Customer customer: customerList){
                if(id == customer.getId()){
                    check = false;
                    return customer;
                }
            }
            if(check){
                System.out.println("Ban da nhap sai id vui long nhap id khach hang");
            }
        }
        return null;
    }

    public static Facility chooseFacility(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sach dich vu");
        for (Map.Entry<Facility, Integer> entry: facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhap id dich vu");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Map.Entry<Facility, Integer> entry: facilityIntegerMap.entrySet()){
                if(id.equals(entry.getKey().getId())){
                    check = false;
                    return entry.getKey();
                }
            }
            if(check){
                System.out.println("Ban da nhap sai id vui long nhap id dich vu");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
