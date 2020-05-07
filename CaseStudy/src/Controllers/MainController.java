package Controllers;

import Models.House;
import Models.Room;
import Models.Villa;

import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class MainController {
    public MainController() {
    }
    List<Villa> villas=new ArrayList<Villa>();
    List<House> houses=new ArrayList<House>();
    List<Room> rooms=new ArrayList<Room>();
    List<Customer> customers=new ArrayList<Customer>();
    TreeSet<String> listRoomNotDuplicate = new TreeSet<>();
    TreeSet<String> listHouseNotDuplicate = new TreeSet<>();
    TreeSet<String> listVillaNotDuplicate = new TreeSet<>();
    public void findEmployee(){
        TuHoSo tuHoSo=new TuHoSo();
        try {
            tuHoSo.readCsvEmployee();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void bookingMovieTicket4D(){
        Cinema4D.cinema();
    }
    public void showInformationEmployee(){
        FileShowEmployee readCsvEmployee = new FileShowEmployee();
        try {
            readCsvEmployee.readCsvEmployee();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showAllNameRoomNotDuplicate() throws IOException {
        FileShowRoom readCsvRoom = new FileShowRoom();
        listRoomNotDuplicate = readCsvRoom.readCsvRoomNotDuplicate();
        int i = 0;
        System.out.println("List Name Room Not Duplicate: ");
        for (String listRoom : listRoomNotDuplicate) {
            i++;
            System.out.println(i + "." + listRoom);
            System.out.println("------------------------------------------------------------------------");
        }
    }
    public void showAllNameHouseNotDuplicate() throws IOException {
        FileShowHouse readCsvHouse = new FileShowHouse();
        listHouseNotDuplicate = readCsvHouse.readCsvHouseNotDuplicate();
        int i = 0;
        System.out.println("List Name House Not Duplicate: ");
        for (String listHouse : listHouseNotDuplicate) {
            i++;
            System.out.println(i + "." + listHouse);
            System.out.println("------------------------------------------------------------------------");
        }
    }
    public void showAllNameVillaNotDuplicate() throws IOException {
        FileShowVilla readCsvVilla = new FileShowVilla();
        listVillaNotDuplicate = readCsvVilla.readCsvVillaNotDuplicate();
        int i = 0;
        System.out.println("List Name House Not Duplicate: ");
        for (String listVilla : listVillaNotDuplicate) {
            i++;
            System.out.println(i + "." + listVilla);
            System.out.println("------------------------------------------------------------------------");
        }
    }
    public void addServicesRoom(Customer customer) throws IOException {
        FileWriteBooking writeCsvBooking = new FileWriteBooking();
        FileShowRoom readCsvRoom = new FileShowRoom();
        Scanner scanner = new Scanner(System.in);
        rooms = readCsvRoom.readCsvRoom();
        System.out.println("-------------------------->");
        System.out.println("List Room: ");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println((i + 1) + ". ID: " + rooms.get(i).getId() + ". Room Name: " + rooms.get(i).getNameService()
                    + ". Have Rental Costs:" + rooms.get(i).getRentalFee());
            System.out.println("............................THE END............................");
        }
        String choose;
        Room services = null;
        boolean flag = true;
        do {
            System.out.print("Choose Room you want to booking: ");
            choose = scanner.nextLine();
            if (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) <= rooms.size()) {
                services = rooms.get(Integer.parseInt(choose) - 1);
                flag = false;
            } else {
                System.out.println("Enter again: ");
            }
        } while (flag);
        customer.setServices(services);
        writeCsvBooking.writeCsvBookingRoomFile(customer, services);
    }
    public void addServicesHouse(Customer customer) throws IOException {
        FileWriteBooking writeCsvBooking = new FileWriteBooking();
        FileShowHouse readCsvHouse = new FileShowHouse();
        Scanner scanner = new Scanner(System.in);
        houses = readCsvHouse.readCsvHouse();
        System.out.println("-------------------------->");
        System.out.println("House List: ");
        for (int i = 0; i < houses.size(); i++) {
            System.out.println((i + 1) + ". ID: " + houses.get(i).getId() + ". House Name: " + houses.get(i).getNameService() + ". Stand Room: "
                    + houses.get(i).getStandardRoom() + ". Rental Costs: " + houses.get(i).getRentalFee());
            System.out.println("............................THE END............................");
        }
        String choose;
        House services = null;
        boolean flag = true;
        do {
            System.out.print("Choose House you want to booking: ");
            choose = scanner.nextLine();
            if (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) <= houses.size()) {
                services = houses.get(Integer.parseInt(choose) - 1);
                flag = false;
            } else {
                System.out.println("Enter again: ");
            }
        } while (flag);
        customer.setServices(services);
        writeCsvBooking.writeCsvBookingHouseFile(customer, services);
    }
    public void addServicesVilla(Customer customer) throws IOException {
        FileWriteBooking writeCsvBooking = new FileWriteBooking();
        FileShowVilla readCsvVilla = new FileShowVilla();
        Scanner scanner = new Scanner(System.in);
        villas=readCsvVilla.readCsvVilla();
        System.out.println("-------------------------->");
        System.out.println("Villa List: ");
        for (int i = 0; i < villas.size(); i++) {
            System.out.println((i + 1) + ". ID: " + villas.get(i).getId() + ". Name Villa: " + villas.get(i).getNameService() + ". Standard Room: "
                    + villas.get(i).getStandardRoom() + ". Rental Costs: " + villas.get(i).getRentalFee());
            System.out.println("............................THE END............................");
        }
        String choose;
        Villa services = null;
        boolean flag = true;
        do {
            System.out.print("Choose Villa you want to booking: ");
            choose = scanner.nextLine();
            if (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) <= villas.size()) {
                services = villas.get(Integer.parseInt(choose) - 1);
                flag = false;
            } else {
                System.out.println("Enter again: ");
            }
        } while (flag);
        customer.setServices(services);
        writeCsvBooking.writeCsvBookingVillaFile(customer, services);
    }
    public void addNewBook() throws IOException {
        ReadCsvCustomer readCsvCustomer = new ReadCsvCustomer();
        Scanner scanner = new Scanner(System.in);
        customers = readCsvCustomer.readCsvCustomer();
        System.out.println("-------------------------->");
        System.out.println("Customer List: ");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ". Name Customer: " + customers.get(i).getNameCustomer() + ". ID Customer" + customers.get(i).getIdCard() + ". Birthday Customer: "
                    + customers.get(i).getBirthDay());
            System.out.println("............................THE END............................");
        }
        Customer customer = null;
        String choose;
        boolean flag = true;
        do {
            System.out.print("Choose CUSTOMER you want: ");
            choose = scanner.nextLine();
            if (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) <= customers.size()) {
                customer = customers.get(Integer.parseInt(choose) - 1);
                flag = false;
            } else {
                System.out.println("Enter again: ");
            }
        } while (flag);
        newBook(customer);
    }

    public void newBook(Customer customer) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String choose;
        do {
            System.out.println("-------------------------->");
            System.out.println("Booking List: ");
            System.out.println("1.Booking Villa\n" +
                    "2.Booking House\n" +
                    "3.Booking Room\n" +
                    "4.Back to menu\n" +
                    "5.exit\n");
            System.out.print("Choose number you want to we do: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addServicesVilla(customer);
                    break;
                case "2":
                    addServicesHouse(customer);
                    break;
                case "3":
                    addServicesRoom(customer);
                    break;
                case "4":
                   displayMainMenu();
                    break;
                case "5":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter again: ");
                    this.addNewBook();
                    break;
            }
        } while (true);
    }
    public static String inputPhone() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String phone;
        do {
            System.out.print("Nhap so dien thoai: ");
            phone = scanner.nextLine();
            String regex="^[0]{1}[0-9]{9}$";
            boolean matcher=Pattern.matches(regex,phone);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("SDT phai co 10 so. Vui long nhap lai.");
            }
        } while (flag);
        return phone;
    }
    public static String inputTypeCustomer() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String typeCustomer;
        do {
            System.out.print("Nhap loai khach hang Diamond, Platinium, Gold, Silver, Member: ");
            typeCustomer = scanner.nextLine();
            String regex="^Diamond|Platinium|Gold|Silver|Member$";
            boolean matcher=Pattern.matches(regex,typeCustomer);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Ban phai nhap Diamond, Platinium, Gold, Silver, Member. Vui long nhap lai.");
            }
        } while (flag);
        return typeCustomer;
    }
    public static String inputBirthDay() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String birthDay;
        do {
            System.out.print("Nhap ngay thang nam sinh: ");
            birthDay = scanner.nextLine();
            String regex="^([1-9]{1}|[0]{1}[1-9]{1}|[1-2]{1}[0-9]{1}|[3]{1}[0-1]{1})/([1-9]{1}|[0]{1}[1-9]{1}|[1]{1}[0-2]{1})/(([1]{1}[9]{1}[0-9]{2})|(([2]{1}[0]{1}[0-2]{1}[0-9]{1})|([2]{1}[0]{1}[3]{1}[0-8]{1})))$";
            boolean matcher=Pattern.matches(regex,birthDay);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Nam sinh phai >1900 va <2038, dung dinh dang dd/yy/yyyy. Vui long nhap lai.");
            }
        } while (flag);
        return birthDay;
    }
    public static String inputIdCard() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String idCard;
        do {
            System.out.print("Nhap CMND: ");
            idCard = scanner.nextLine();
            String regex="^[0-9]{3}\\s[0-9]{3}\\s[0-9]{3}$";
            boolean matcher=Pattern.matches(regex,idCard);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("CMND phai co 9 so va theo dinh dang XXX XXX XXX. Vui long nhap lai.");
            }
        } while (flag);
        return idCard;
    }
    public static String inputGender() {
        Scanner scanner=new Scanner(System.in);
        String email;
        System.out.print("Nhap gioi tinh: ");
        email = scanner.nextLine();
        String regex="Male|Female|Unknown";
        boolean matcher=Pattern.matches(regex,email);
        if (matcher) {
            return email;
        } else {
            return "Unknown";
        }
    }
    public static String inputEmail() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String email;
        do {
            System.out.print("Nhap dia chi Email: ");
            email = scanner.nextLine();
            String regex="^[a-z0-9A-Z]{1,}@[a-z]{1,}.[a-z]{1,}$";
            boolean matcher=Pattern.matches(regex,email);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Emai phai dung dinh dang: abc@abc.abc . Vui long nhap lai.");
            }
        } while (flag);
        return email;
    }
    public static String inputNameCustomer() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String nameCustomer;
        do {
            System.out.print("Nhap ten khach hang: ");
            nameCustomer = scanner.nextLine();
            String regex="^[A-Z]{1}[a-z]{0,}(\\s{1}[A-Z]{1}[a-z]{0,}){0,}$";
            boolean matcher=Pattern.matches(regex,nameCustomer);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Ten khach hang phai in hoa ki tu dau tien trong moi tu. Vui long nhap lai.");
            }
        } while (flag);
        return nameCustomer;
    }
    public static String inputDescriptionAmenities() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String descriptionAmenities;
        do {
            System.out.print("Nhap vao tien nghi(tv, playstation, food, drink): ");
            descriptionAmenities = scanner.nextLine();
            String regex="tv|playstation|food|drink";
            boolean matcher=Pattern.matches(regex,descriptionAmenities);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Format True: Nhap tv, playstation, food, drink. Vui long nhap lai.");
            }
        } while (flag);
        return descriptionAmenities;
    }
    public static int inputNumberFloor() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String numberFloor;
        do {
            System.out.print("Nhap vao so tang: ");
            numberFloor = scanner.nextLine();
            String patt = "(\\d){1,2}";
            boolean math = numberFloor.matches(patt);
            if (math && (Integer.parseInt(numberFloor) > 0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao >0. Vui long nhap lai.");
            }

        } while (flag);
        return Integer.valueOf(numberFloor);
    }
    public static int inputMaxPeople() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String maxPeople;
        do {
            System.out.print("Nhap vao so nguoi toi da: ");
            maxPeople = scanner.nextLine();
            String patt = "(\\d){1,2}";
            boolean math = maxPeople.matches(patt);
            if (math && ((Integer.parseInt(maxPeople) > 0) && (Integer.parseInt(maxPeople) < 20))) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao >0 va <20. Vui long nhap lai.");
            }

        } while (flag);
        return Integer.valueOf(maxPeople);
    }
    public static double inputRentalFee() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String rentalFee;
        do {
            System.out.print("Nhap vao chi phi thue: ");
            rentalFee = scanner.nextLine();
            String patt = "^[0-9]+(\\d){0,}+\\.+(\\d){1,}";
            boolean math = rentalFee.matches(patt);
            if (math && (Double.valueOf(rentalFee) > 0.0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao >0.0. Vui long nhap lai.");
            }

        } while (flag);
        return Double.valueOf(rentalFee);
    }
    public static double inputPoolArea() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String areaPool;
        do {
            System.out.print("Nhap vao dien tich ho boi: ");
            areaPool = scanner.nextLine();
            String patt = "^[1-9]+(\\d){1,}+\\.+(\\d){1,}";
            boolean math = areaPool.matches(patt);
            if (math && (Double.valueOf(areaPool) > 30.0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao >30.0. Vui long nhap lai.");
            }

        } while (flag);
        return Double.valueOf(areaPool);
    }
    public static double inputAreaUsed() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String areaUsed;
        do {
            System.out.print("Nhap vao dien tich su dung: ");
            areaUsed = scanner.nextLine();
            String patt = "^[1-9]+(\\d){1,}+\\.+(\\d){1,}";
            boolean math = areaUsed.matches(patt);
            if (math && (Double.valueOf(areaUsed) > 30.0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao >30.0. Vui long nhap lai.");
            }

        } while (flag);
        return Double.valueOf(areaUsed);
    }
    public static String inputStandardRoom() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String standardRoom;
        do {
            System.out.print("Nhap vao tieu chuan phong (Normal|Business|VIP): ");
            standardRoom = scanner.nextLine();
            String regex="Normal|Business|VIP";
            boolean matcher=Pattern.matches(regex,standardRoom);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Format True: Normal|Business|VIP. Vui long nhap lai.");
            }
        } while (flag);
        return standardRoom;
    }
    public static String inputTypeRent() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String typeRent;
        do {
            System.out.print("Nhap vao kieu thue (Day|Month|Year|Hour|Week): ");
            typeRent = scanner.nextLine();
            String regex="Day|Month|Year|Hour|Week";
            boolean matcher=Pattern.matches(regex,typeRent);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Format True: Nhap Day(theo ngay), Month(theo thang), Year(theo nam)" +
                        "Hour(theo gio), Week(theo tuan). Vui long nhap lai.");
            }
        } while (flag);
        return typeRent;
    }
    public static String inputNameService() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String nameService;
        do {
            System.out.print("Nhap vao ten dich vu: ");
            nameService = scanner.nextLine();
            String regex="^[A-Z]{1}[a-z]{0,}$";
            boolean matcher= Pattern.matches(regex,nameService);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Format True: Chu dau tien viet hoa va khong co so. Vui long nhap lai.");
            }
        } while (flag);
        return nameService;
    }
    public void addNewServices() throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu Add New Services: ");
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        System.out.print("Nhap so tuong ung voi chuc nang: ");
        int choose=scanner.nextInt();
        switch (choose){
            case 1:{
//                List<Villa> villas=new ArrayList<Villa>();
                FileWriteVilla.writeCsvFile("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Villa.csv", villas);
            }break;
            case 2:{
//                List<House> houses=new ArrayList<House>();
                FileWriteHouse.writeCsvFile("D:\\CodegymMD2\\CaseStudy\\src\\Data\\House.csv", houses);
            }break;
            case 3:{
//                List<Room> rooms=new ArrayList<Room>();
                FileWriteRoom.writeCsvFile("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Room.csv", rooms);
            }break;
            case 4:{displayMainMenu();}break;
            case 5:{
                System.exit(0);
            }break;
        }
    }
    public void showServices() throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu Show Services: ");
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        System.out.print("Chon chuc nang tuong ung ban muon thuc hien: ");
        int choose=scanner.nextInt();
        switch (choose){
            case 1:{FileShowVilla.showMain(villas);}break;
            case 2:{FileShowHouse.showMain(houses);}break;
            case 3:{FileShowRoom.showMain(rooms);}break;
            case 4:{
                showAllNameVillaNotDuplicate();
            }break;
            case 5:{
                showAllNameHouseNotDuplicate();
            }break;
            case 6:{
                showAllNameRoomNotDuplicate();
            }break;
            case 7:{displayMainMenu();}break;
            case 8:{System.exit(0);}break;
        }
    }

    public void displayMainMenu() throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu lua chon:");
        System.out.println("1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tBooking Movie Ticket 4D\n" +
                "8.\tFind Employee\n" +
                "9.\tExit\n");
        System.out.print("Nhap so tuong ung voi chuc nang muon thuc hien: ");
        int choose=scanner.nextInt();
        switch (choose){
            case 1:{
                addNewServices();
            }
            break;
            case 2:{
                showServices();
            }
            break;
            case 3:{
                Customer.addNewCustomer(customers);
            }
            break;
            case 4:{

                ReadCsvCustomer readCsvCustomer = new ReadCsvCustomer();
                customers = readCsvCustomer.readCsvCustomer();
                for (Customer ct : customers) {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println(ct.showInfor());
                    System.out.println("--------------------------------------------------------------------------------");
                }
            }
            break;
            case 5:{
                addNewBook();
            }
            break;
            case 6:{
                showInformationEmployee();
            }
            break;
            case 7:{
                bookingMovieTicket4D();
            }
            break;
            case 8:{
                findEmployee();
            }
            break;
            case 9:{
                System.exit(0);
            }
            break;

        }
    }
}
