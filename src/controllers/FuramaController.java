package controllers;

import services.BookingServiceImpl;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {

        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        displayEmployee();
                        break;
                    case 2:
                        displayCustomer();
                        break;
                    case 3:
                        displayFacility();
                        break;
                    case 4:
                        displayBooking();
                        break;
                    case 5:
                        displayUsingService();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Chon sai vui long chon lai");
                        break;
                }
            } catch (Exception e) {
                System.err.println("Chon sai, vui long chon lai");
            }
        }
    }

    public static void displayEmployee() {

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1.Display list employees");
                System.out.println("2.Add new employee");
                System.out.println("3.Edit employee");
                System.out.println("4.Return main menu");

                switch (scanner.nextInt()) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        employeeService.add();
                        break;
                    case 3:
                        employeeService.edit();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    default:
                        System.err.println("Chua co chuc nang nay, vui long chon lai");
                }
            } catch (NumberFormatException e) {
                System.err.println("Chon sai, vui long chon lai");
            }
        }
    }

    public static void displayCustomer() {

        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1.Display list customer");
                System.out.println("2.Add new customer");
                System.out.println("3.Edit customer");
                System.out.println("4.Return main menu");

                int choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        customerService.add();
                        break;
                    case 3:
                        customerService.edit();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    default:
                        System.err.println("Chua co lua chon vui long nhap lai");
                        break;
                }
            } catch (Exception e) {
                System.err.println("Chon sai vui long nhap lai");
            }
        }
    }

    public static void displayFacility() {
        boolean check = true;
        while (check) {
        System.out.println("1.Display list facility");
        System.out.println("2.Add new facility");
        System.out.println("3.Display list facility maintenance ");
        System.out.println("4.Return main menu");
        BookingServiceImpl bookingService = new BookingServiceImpl();
            try {
                Scanner scanner = new Scanner(System.in);
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        bookingService.display();
                        break;
                    case 2:
                        bookingService.add();
                        break;
                    case 3:
                    case 4:
                    default:
                        System.err.println("Nhap sai vui long nhap lai");
                }
            } catch (Exception e) {
                System.err.println("Nhap sai, vui long nhap lai");
            }
        }
    }
        public static void displayBooking () {

            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new contracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contract");
            System.out.println("6.Return main menu");

            BookingServiceImpl bookingService = new BookingServiceImpl();
            boolean check = true;
            while (check) {
                Scanner scanner = new Scanner(System.in);
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        bookingService.add();
                        displayBooking();
                        break;
                    case 2:
                        bookingService.display();
                        displayBooking();
                        break;
                }
            }
        }

        public static void displayUsingService () {
            boolean check = true;
            while (check) {
                try {
                    System.out.println("1.Display list customers use service");
                    System.out.println("2.Display list customers use service");
                    System.out.println("3.Return main menu");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                        case 2:
                        case 3: displayMainMenu();
                        break;
                        default:
                            System.err.println("Nhap sai vui long nhap lai");
                    }
                } catch (Exception e) {
                    System.err.println("Nhap sai, vui long nhap lai");
                }
            }
        }
        public static void main (String[]args){
            FuramaController.displayMainMenu();
        }
    }

