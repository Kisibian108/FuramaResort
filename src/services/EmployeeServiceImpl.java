package services;

import models.Employee;
import models.Person;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static int count;

    static {
        Employee employee1 = new Employee(1, "Lam", 1992, "Male", 184016595, 973439239, "kisibian108@gmail.com", "University", "Staff", 10000000);
        Employee employee2 = new Employee(2, "Hoa", 1989, "Female", 182084354, 973245368, "hoanglien249@gmail.com", "University", "Staff", 10000000);
        Employee employee3 = new Employee(3, "Nam", 1991, "Male", 184325427, 973425360, "namtuoc105@gmail.com", "University", "Staff", 12000000);
        count = 3;
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
    }

    public static void main(String[] args) {
        String line = null;
        for (Employee employee : list) {
            line = employee.getId() + "," +
                    employee.getName() + "," +
                    employee.getBirthDay() + "," +
                    employee.getGender() + "," +
                    employee.getIdCard() + "," +
                    employee.getPhoneNumber() + "," +
                    employee.getEmail() + "," +
                    employee.getLevel() + "," +
                    employee.getPosition() + "," +
                    employee.getSalary();
            EmployeeServiceImpl.writeFile("src/data/employee.csv", line);
        }
    }

    public static void writeFile(String path, String line) {
        try {
            File file = new File("src/data/employee.csv");
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
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {

        System.out.println("Nhap id:");
        int id = Integer.parseInt(scanner.nextLine());
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
        System.out.println("Nhap trinh do: ");
        String level = scanner.nextLine();
        System.out.println("Nhap vi tri");
        String position = scanner.nextLine();
        System.out.println("Nhap luong:");
        double salary = Double.parseDouble(scanner.nextLine());

        list.add(new Employee(count + 1, name, birthday, gender, idCard, phone, email, level, position, salary));
        count++;
        display();
    }

    @Override
    public void edit() {
        System.out.println("Nhap id muon sua");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : list) {
            if (employee.getId() == id) {
                employee.setId(id);

                System.out.println("Nhap ten muon sua");
                String name = scanner.nextLine();
                employee.setName(name);

                System.out.println("Nhap nam sinh");
                int birthday = Integer.parseInt(scanner.nextLine());
                employee.setBirthDay(birthday);

                System.out.println("Nhap gioi tinh");
                String gender = scanner.nextLine();
                employee.setGender(gender);

                System.out.println("Nhap chung minh thu");
                long idCard = Long.parseLong(scanner.nextLine());
                employee.setIdCard(idCard);

                System.out.println("Nhap so dien thoai");
                long phone = Long.parseLong(scanner.nextLine());
                employee.setPhoneNumber(phone);

                System.out.println("Nhap email");
                String email = scanner.nextLine();
                employee.setEmail(email);

                System.out.println("Nhap trinh do: ");
                String level = scanner.nextLine();
                employee.setLevel(level);

                System.out.println("Nhap vi tri");
                String position = scanner.nextLine();
                employee.setPosition(position);

                System.out.println("Nhap luong:");
                double salary = Double.parseDouble(scanner.nextLine());
                employee.setSalary(salary);
            }
        }
        display();
    }

    @Override
    public void remove() {

    }
}