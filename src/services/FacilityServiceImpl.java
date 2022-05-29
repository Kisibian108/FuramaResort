package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {

    static Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static int count;

    static {
    }

    @Override
    public void display() {
        Set<Facility> set = facilityIntegerMap.keySet();
        for (Facility key : set) {
            System.out.println("Dich vu: " + key + " So lan da thue: " + facilityIntegerMap.get(key));
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back to menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Nhap id");
                String id = scanner.nextLine();
                System.out.println("Nhap ten dich vu:");
                String name = scanner.nextLine();
                System.out.println("Nhap dien tich");
                double area = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap gia");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap so nguoi toi da");
                int max = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap kieu thue");
                String type = (scanner.nextLine());
                System.out.println("Nhap tieu chuan phong");
                String standard = scanner.nextLine();
                System.out.println("Nhap dien tich ho boi");
                double lakeArea = Double.parseDouble(scanner.nextLine());

                Villa villa = new Villa(id,name, area, price, max, type, standard, lakeArea);
                facilityIntegerMap.put(villa, 0);
                System.out.println("Da them moi thanh cong");
                display();
                break;
            case 2:
                System.out.println("Nhap id");
                String id1 = (scanner.nextLine());
                System.out.println("Nhap ten dich vu:");
                String name1 = scanner.nextLine();
                System.out.println("Nhap dien tich");
                double area1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap gia");
                double price1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap so nguoi toi da");
                int max1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap kieu thue");
                String type1 = (scanner.nextLine());
                System.out.println("Nhap tieu chuan phong");
                String standard1 = scanner.nextLine();
                System.out.println("Nhap so tang");
                int floor = Integer.parseInt(scanner.nextLine());
                House house = new House(id1,name1, area1, price1, max1, type1, standard1, floor);
                facilityIntegerMap.put(house, 0);
                System.out.println("Them house moi thanh cong");
                display();
                break;
            case 3:
                System.out.println("Nhap id");
                String id2 = (scanner.nextLine());
                System.out.println("Nhap ten dich vu:");
                String name2 = scanner.nextLine();
                System.out.println("Nhap dien tich");
                double area2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap gia");
                double price2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap so nguoi toi da");
                int max2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap kieu thue");
                String type2 = (scanner.nextLine());
                System.out.println("Nhap dich vu mien phi");
                String service2 = (scanner.nextLine());
                Room room = new Room(id2, name2, area2, price2, max2, type2, service2);
                facilityIntegerMap.put(room, 0);
                System.out.println("Them moi thanh cong");
                display();
                break;
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }

}
