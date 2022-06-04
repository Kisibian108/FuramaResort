package services;

import models.Customer;
import utils.CheckException;
import utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl2 implements CustomerService {
    public static final String BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
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
        int id = CheckException.checkParseInt();

        System.out.println("Nhap ten:");
        String name = scanner.nextLine();

        System.out.println("Nhap nam sinh");
        String birthday = RegexData.regexAge(scanner.nextLine(), BIRTHDAY);

        System.out.println("Nhap gioi tinh");
        System.out.println("1: Male");
        System.out.println("2: Female");
        String gender = scanner.nextLine();
        switch (gender) {
            case "1":
                System.out.println("Male");
                break;
            case "2":
                System.out.println("Female");
                break;
        }

        System.out.println("Nhap chung minh thu");
        long idCard = CheckException.checkParseLong();

        System.out.println("Nhap so dien thoai");
        long phone = CheckException.checkParseLong();

        System.out.println("Nhap email");
        String email = scanner.nextLine();

        System.out.println("Nhap loai khach: ");
        System.out.println("1: Diamond");
        System.out.println("2: Platinium");
        System.out.println("1: Gold");
        System.out.println("2: Silver");
        System.out.println("2: Member");
        String type = scanner.nextLine();
        switch (type){
            case "1":
                System.out.println("Diamond");
                break;
            case "2":
                System.out.println("Platinium");
                break;
            case "3":
                System.out.println("Gold");
                break;
            case "4":
                System.out.println("Silver");
                break;
            case "5":
                System.out.println("Member");
                break;
        }

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
                String birthday = RegexData.regexAge(scanner.nextLine(),BIRTHDAY);
                customer.setBirthDay(birthday);

                System.out.println("Nhap gioi tinh");
                System.out.println("1: Male");
                System.out.println("2: Female");
                String gender = scanner.nextLine();
                switch (gender) {
                    case "1":
                        System.out.println("Male");
                        break;
                    case "2":
                        System.out.println("Female");
                        break;
                }
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
                System.out.println("1: Diamond");
                System.out.println("2: Platinium");
                System.out.println("1: Gold");
                System.out.println("2: Silver");
                System.out.println("2: Member");
                String type = scanner.nextLine();
                switch (type){
                    case "1":
                        System.out.println("Diamond");
                        break;
                    case "2":
                        System.out.println("Platinium");
                        break;
                    case "3":
                        System.out.println("Gold");
                        break;
                    case "4":
                        System.out.println("Silver");
                        break;
                    case "5":
                        System.out.println("Member");
                        break;
                }
                customer.setTypeCustomer(type);

                System.out.println("Nhap dia chi:");
                String address = scanner.nextLine();
                customer.setAddress(address);
            }
        }
        display();
    }

}

