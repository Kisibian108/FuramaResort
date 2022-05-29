package services;

import models.Customer;
import models.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    static Scanner scanner = new Scanner(System.in);
    static LinkedList<Customer> linkedList = new LinkedList<>();
    static int count;

    static {
        linkedList.add(new Customer(1, "Linh", 1994, "Male", 184392567, 974325476, "kisibian999@gmail.com", "Gold", "Ha Tinh"));
        linkedList.add(new Customer(2, "Hoa", 1987, "Female", 182354657, 976324321, "hoanglien124@gmail.com", "Diamond", "Da Nang"));
        linkedList.add(new Customer(3, "Ngoc", 1988, "Female", 183245365, 974325467, "kisibian249@gmail.com", "Silve", "Hai Phong"));
        count = 3;
    }

    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.add();
        String line = null;
        for (Customer customer : linkedList) {
            line = customer.getId() + "," +
                    customer.getName() + "," +
                    customer.getBirthDay() + "," +
                    customer.getGender() + "," +
                    customer.getIdCard() + "," +
                    customer.getPhoneNumber() + "," +
                    customer.getEmail() + "," +
                    customer.getTypeCustomer() + "," +
                    customer.getAddress();
            CustomerServiceImpl.writeFile("src/data/customer.csv", line);
        }

    }

    public static void writeFile(String path, String line) {
        File file = new File("src/data/customer.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        for (Customer customer : linkedList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        boolean check = true;
        while (check) {
            try {
                System.out.println("Nhap id:");
                int id = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (Exception e) {
                System.err.println("Chi duoc nhap so");
            }
        }

        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        System.out.println("Nhap nam sinh");
        int birthday = Integer.parseInt(scanner.nextLine());

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


        linkedList.add(new Customer(count + 1, name, birthday, gender, idCard, phone, email, type, address));
        count++;
        display();
    }

    @Override
    public void edit() {
        System.out.println("Nhap id muon sua");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customer : linkedList) {
            if (customer.getId() == id) {
                customer.setId(id);

                System.out.println("Nhap ten muon sua");
                String name = scanner.nextLine();
                customer.setName(name);

                System.out.println("Nhap nam sinh");
                int birthday = Integer.parseInt(scanner.nextLine());
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

    @Override
    public void remove() {

    }

}
