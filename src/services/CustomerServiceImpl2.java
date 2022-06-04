package services;

import models.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl2 implements CustomerService {
    private List<Customer> customers = new ArrayList<>();
    private static final String CUSTOMER = "src/data/customer.csv";
    static Scanner scanner = new Scanner(System.in);
    static int count;

    public static void main(String[] args) {
        CustomerServiceImpl2 customerService = new CustomerServiceImpl2();
        customerService.display();
        customerService.add();
    }

    @Override
    public void display() {
        customers = FileService.readCustomer(CUSTOMER);
        if (!customers.isEmpty()) {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        } else {
            System.out.println("List rong");
        }
    }

    @Override
    public void add() {
        customers = FileService.readCustomer(CUSTOMER);
        System.out.println("Nhap id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        System.out.println("Nhap nam sinh");
        String birthday = (scanner.nextLine());
        System.out.println("Nhap gioi tinh");
        String gender = scanner.nextLine();
        System.out.println("Nhap chung minh thu");
        long idCard = Long.parseLong(scanner.nextLine());
        System.out.println("Nhap so dien thoai");
        long phone = Long.parseLong(scanner.nextLine());
        System.out.println("Nhap email");
        String email = scanner.nextLine();
        System.out.println("Nhap loai khach: ");
        String type = scanner.nextLine();
        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();
        count++;
        customers.add(new Customer(id, name, birthday, gender, idCard, phone, email, type, address));
        FileService.writeCustomer(CUSTOMER, customers);
        display();
    }

    @Override
    public void edit() {
        System.out.println("Nhap id muon sua");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customer.setId(id);

                System.out.println("Nhap ten muon sua");
                String name = scanner.nextLine();
                customer.setName(name);

                System.out.println("Nhap nam sinh");
                String birthday = (scanner.nextLine());
                customer.setBirthDay(birthday);

                System.out.println("Nhap gioi tinh");
                String gender = scanner.nextLine();
                customer.setGender(gender);

                System.out.println("Nhap chung minh thu");
                long idCard = Long.parseLong(scanner.nextLine());
                customer.setIdCard(idCard);

                System.out.println("Nhap so dien thoai");
                long phone = Long.parseLong(scanner.nextLine());
                customer.setPhoneNumber(phone);

                System.out.println("Nhap email");
                String email = scanner.nextLine();
                customer.setEmail(email);

                System.out.println("Nhap loai khach");
                String type = scanner.nextLine();
                customer.setTypeCustomer(type);

                System.out.println("Nhap dia chi:");
                String address = scanner.nextLine();
                customer.setAddress(address);
            }
        }
        display();
    }

}

