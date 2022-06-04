package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import utils.RegexData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static final String STR = "[A-Z][a-z]+";
    private static final String VILLA = "^[SVVL]+[-]+[0-9]{4}$";
    private static final String HOUSE = "^(SVHO)+[-]+[0-9]{4}$";
    private static final String ROOM = "^(SVRO)+[-]+[0-9]{4}$";
    private static final String AREA = "^[3-9]{1}+[0-9]+$";
    private static final String PRICE = "^[0-9]+$";
    private static final String MAX = "^[1-9]|([1][0-9])|(20)$";
    private static final String FLOOR = "^[0-9]$";
    private static final String STYLE_VILLA = "[A-Z][a-z]+";
    private static final String STYLE_HOUSE = "[A-Z][a-z]+";
    private static final String STYLE_ROOM = "[A-Z][a-z]+";
    private static final String STANDARD = "[A-Z][a-z]+";

    static Scanner scanner = new Scanner(System.in);
    private static final String FACILITY_VILLA = "src/data/villa.csv";
    static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.display();


    }

    @Override
    public void display() {
        System.out.println("1. Villa");
        System.out.println("2. House");
        System.out.println("3. Room");
        System.out.println("4. Back to menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                for (Villa v : FileService.readVilla("src/data/villa.csv")) {
                    villaIntegerMap.put(v, 1);
                }

                Set<Villa> set = villaIntegerMap.keySet();
                for (Villa key : set) {
                    System.out.println("Dich vu: " + key + " So lan da thue: " + villaIntegerMap.get(key));
                }
                break;
            case 2:
                for (House v : FileService.readHouse("src/data/house.csv")) {
                    houseIntegerMap.put(v, 1);
                }

                Set<House> set1 = houseIntegerMap.keySet();
                for (House key : set1) {
                    System.out.println("Dich vu: " + key + " So lan da thue: " + houseIntegerMap.get(key));
                }
                break;
            case 3:
                for (Room v : FileService.readRoom("src/data/room.csv")) {
                    roomIntegerMap.put(v, 1);
                }

                Set<Room> set2 = roomIntegerMap.keySet();
                for (Room key : set2) {
                    System.out.println("Dich vu: " + key + " So lan da thue: " + roomIntegerMap.get(key));
                }
                break;
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
                for (Villa v : FileService.readVilla("src/data/villa.csv")) {
                    villaIntegerMap.put(v, 1);
                }
                System.out.println("Nhap id, ma dich vu");
                String id = inputVillaID();

                System.out.println("Nhap ten");
                String name = inputName();

                System.out.println("Nhap dien tich");
                double area = Double.parseDouble(inputArea());

                System.out.println("Nhap gia tien");
                double price = Double.parseDouble(inputPrice());

                System.out.println("Nhap so nguoi thue toi da");
                int max = Integer.parseInt(inputMax());

                System.out.println("Nhap kieu thue");
                String type = inputType();

                System.out.println("Nhap tieu chuan phong");
                String standard = inputStandard();

                System.out.println("Nhap dien tich ho boi");
                double lakeArea = Double.parseDouble(inputLakeArea());

                villaIntegerMap.put(new Villa(id, name, area, price, max, type, standard, lakeArea), 0);
                System.out.println("Da them moi thanh cong");

                FileService.writeVilla("src/data/villa.csv", villaIntegerMap);
                break;

            case 2:
                for (House v : FileService.readHouse("src/data/house.csv")) {
                    houseIntegerMap.put(v, 1);
                }

                System.out.println("Nhap id, ma dich vu");
                String id1 = inputHouseID();

                System.out.println("Nhap ten dich vu:");
                String name1 = inputName();

                System.out.println("Nhap dien tich");
                double area1 = Double.parseDouble(inputArea());

                System.out.println("Nhap gia");
                double price1 = Double.parseDouble(inputPrice());

                System.out.println("Nhap so nguoi toi da");
                int max1 = Integer.parseInt(inputMax());

                System.out.println("Nhap kieu thue");
                String type1 = (inputType());

                System.out.println("Nhap tieu chuan phong");
                String standard1 = inputStandard();

                System.out.println("Nhap so tang");
                int floor = Integer.parseInt(inputfloor());

                House house = new House(id1, name1, area1, price1, max1, type1, standard1, floor);
                houseIntegerMap.put(house, 0);
                System.out.println("Them house moi thanh cong");

                FileService.writeHouse("src/data/house.csv", houseIntegerMap);
                break;
            case 3:
                for (Room room : FileService.readRoom("src/data/room.csv")) {
                    roomIntegerMap.put(room, 1);
                }
                System.out.println("Nhap id, ma dich vu");
                String id2 = inputRoomID();

                System.out.println("Nhap ten dich vu:");
                String name2 = inputName();

                System.out.println("Nhap dien tich");
                double area2 = Double.parseDouble(inputArea());

                System.out.println("Nhap gia");
                double price2 = Double.parseDouble(inputPrice());

                System.out.println("Nhap so nguoi toi da");
                int max2 = Integer.parseInt(inputMax());

                System.out.println("Nhap kieu thue");
                String type2 = (inputType());

                System.out.println("Nhap dich vu mien phi");
                String service2 = (inputName());
                Room room = new Room(id2, name2, area2, price2, max2, type2, service2);
                roomIntegerMap.put(room, 0);
                System.out.println("Them moi thanh cong");
                FileService.writeRoom("src/data/room.csv", roomIntegerMap);
                break;
        }
    }

    private String inputVillaID() {
        return RegexData.regexStr(scanner.nextLine(), VILLA, "Ban da nhap sai dinh dang, ma dich vu phai co dang SVVL-XXXX");
    }

    private String inputHouseID() {
        return RegexData.regexStr(scanner.nextLine(), HOUSE, "Ban da nhap sai dinh dang, ma dich vu phai co dang SVHO-XXXX");
    }

    private String inputRoomID() {
        return RegexData.regexStr(scanner.nextLine(), ROOM, "Ban da nhap sai dinh dang, ma dich vu phai co dang SVRO-XXXX");
    }


    private String inputName() {

        return RegexData.regexStr(scanner.nextLine(), STR, "Ban da nhap sai dinh dang, ten dich vu phai viet hoa chu cai dau");
    }

    private String inputArea() {

        return RegexData.regexStr(scanner.nextLine(), AREA, "Ban da nhap sai dinh dang, dien tich phai lon hon 30");
    }

    private String inputPrice() {

        return RegexData.regexStr(scanner.nextLine(), PRICE, "Ban da nhap sai dinh dang, gia tien phai la so duong");
    }

    private String inputMax() {

        return RegexData.regexStr(scanner.nextLine(), MAX, "Ban da nhap sai dinh dang, so nguoi toi da lon hon 0 va nho hon 20");
    }

    private String inputType() {
        return RegexData.regexStr(scanner.nextLine(), STYLE_VILLA, "Ban da nhap sai dinh dang, phai viet hoa chu cai dau");
    }

    private String inputStandard() {
        return RegexData.regexStr(scanner.nextLine(), STANDARD, "Ban da nhap sai dinh dang, phai viet hoa chu cai dau");
    }

    private String inputLakeArea() {
        return RegexData.regexStr(scanner.nextLine(), AREA, "Ban da nhap sai dinh dang, dien tich phai lon hon 30");
    }

    private String inputfloor() {
        return RegexData.regexStr(scanner.nextLine(), FLOOR, "Ban da nhap sai dinh dang, so tang phai la so nguyen duong");
    }

    public void writeFileVilla() {
        FileService.writeVilla("src/data/villa.csv", villaIntegerMap);
    }

    @Override
    public void edit() {

    }
}
